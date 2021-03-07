package org.jesperancinha.java11.mastery2dot1.ost.manager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class FileManager {

    public void testFile() {
        final Function<File, String> test = file -> {
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.append("Test");
                fileWriter.flush();
            } catch (IOException e) {
                RED.printThrowableAndExit(e);
            }
            return file.getName();
        };
        final List<String> strings = executeFunction(test);
        RED.printGeneric(strings.toString());
        final List<String> strings1 = executeFunction2(test);
        RED.printGeneric(strings1.toString());
        BRIGHT_CYAN.printGeneric("%s\n", allOSTFiles.toString());
    }

    List<File> allOSTFiles = Collections.singletonList(new File("/tmp/ost.txt"));

    public <R> List<R> executeFunction(Function<File, R> fun) {
        List<R> l = new ArrayList<>();
        for (File f : allOSTFiles) {
            Permission perm = new java.io.FilePermission(f.getPath(), "read");
            PermissionCollection perms = perm.newPermissionCollection();
            perms.add(perm);
            AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
                l.add(fun.apply(f));
                return null;
            }, new AccessControlContext(new ProtectionDomain[]{
                    new ProtectionDomain(null, perms)}));
        }
        return l;
    }

    public <R> List<R> executeFunction2(Function<File, R> fun) {
        List<R> l = new ArrayList<>();
        for (File f : allOSTFiles) {
            l.add(fun.apply(f));
        }
        return l;
    }
}
