package org.jesperancinha.java11.crums.crum1;

import javax.management.AttributeList;
import javax.management.relation.RoleList;
import javax.management.relation.RoleUnresolvedList;
import java.util.List;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum1 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 1 - The subclasses of ArrayList");

        var arrayList = List.of("Madonna", "Mariah Carey", "Jennifer Lopez", "Shakira", "Beyonce", "Kelly Rowland");
        MAGENTA.printGenericLn("There are indeed three extra sub-types of ArrayList: AttributeList, RoleList, RoleUnresolvedList");

        MAGENTA.printGenericLn("We can present a super music singer list this way:");

        ORANGE.printGenericLn(arrayList);

        var attributeList = new AttributeList();
        attributeList.add(0, "Madonna");
        attributeList.add(0, "Mariah Carey");
        attributeList.add(0, "Jennifer Lopez");
        attributeList.add(0, "Shakira");
        attributeList.add(0, "Beyonce");
        attributeList.add(0, "Kelly Rowland");

        MAGENTA.printGenericLn("We then can use an Attribute List:");
        ORANGE.printGenericLn(attributeList);

        var roleList = new RoleList();
        roleList.add(0, "Madonna");
        roleList.add(0, "Mariah Carey");
        roleList.add(0, "Jennifer Lopez");
        roleList.add(0, "Shakira");
        roleList.add(0, "Beyonce");
        roleList.add(0, "Kelly Rowland");

        MAGENTA.printGenericLn("We then can use an RoleList List:");
        ORANGE.printGenericLn(roleList);

        var roleUnresolvedList = new RoleUnresolvedList();
        roleUnresolvedList.add(0, "Madonna");
        roleUnresolvedList.add(0, "Mariah Carey");
        roleUnresolvedList.add(0, "Jennifer Lopez");
        roleUnresolvedList.add(0, "Shakira");
        roleUnresolvedList.add(0, "Beyonce");
        roleUnresolvedList.add(0, "Kelly Rowland");

        MAGENTA.printGenericLn("Finally we can use an RoleUnresolvedList List:");
        ORANGE.printGenericLn(roleUnresolvedList);

        GREEN.printGenericLn("We can think of the three sub ArrayList types as just roles and attributes");
        GREEN.printGenericLn("We only have one subtype for AttributeList");
        GREEN.printGenericLn("We have two subtypes for roles and they are RoleList and RoleUnresolvedList");
        GREEN.printGenericLn("So Attributes => AttributeList");
        GREEN.printGenericLn("So Roles => RoleList");
        GREEN.printGenericLn("So Roles Unresolved => RoleUnresolvedList");
        GREEN.printGenericLn("We have created three instance examples of the three different listw");

    }
}
