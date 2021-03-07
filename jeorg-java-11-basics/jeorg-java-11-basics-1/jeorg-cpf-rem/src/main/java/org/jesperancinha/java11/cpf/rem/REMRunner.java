package org.jesperancinha.java11.cpf.rem;

import java.util.HashMap;

public class REMRunner {
    public static void main(String[] args) {

        final String s1994 = "1994";
        final String albumFromString = getAlbumFromString(s1994);
        System.out.printf("REM published %s in %s\n", albumFromString, s1994);

        final Integer i2001 = 2001;
        final String albumFromInt = getAlbumInt(i2001);
        System.out.printf("REM published %s in %s\n", albumFromInt, i2001);

        final int c2004 = 2004;
        final String albumFromChar = getAlbumChar(c2004);
        System.out.printf("REM published %s in %s\n", albumFromChar, c2004);

        final byte b2011 = 111;
        final String albumFromByte = getAlbumBy(b2011);
        System.out.printf("REM published %s in %s\n", albumFromByte, 1900 + b2011);

    }

    private static String getAlbumBy(byte byteYear) {
        switch (byteYear) {
            case 83:
                return getRecords().get("1983");
            case 84:
                return getRecords().get("1984");
            case 85:
                return getRecords().get("1985");
            case 86:
                return getRecords().get("1986");
            case 87:
                return getRecords().get("1987");
            case 88:
                return getRecords().get("1988");
            case 91:
                return getRecords().get("1991");
            case 92:
                return getRecords().get("1992");
            case 94:
                return getRecords().get("1994");
            case 96:
                return getRecords().get("1996");
            case 98:
                return getRecords().get("1998");
            case 101:
                return getRecords().get("2001");
            case 104:
                return getRecords().get("2004");
            case 108:
                return getRecords().get("2008");
            case 111:
                return getRecords().get("2011");
        }

        return "Not found!!";
    }

    private static String getAlbumFromString(String year) {
        switch (year) {
            case "1983":
                return getRecords().get("1983");
            case "1984":
                return getRecords().get("1984");
            case "1985":
                return getRecords().get("1985");
            case "1986":
                return getRecords().get("1986");
            case "1987":
                return getRecords().get("1987");
            case "1988":
                return getRecords().get("1988");
            case "1991":
                return getRecords().get("1991");
            case "1992":
                return getRecords().get("1992");
            case "1994":
                return getRecords().get("1994");
            case "1996":
                return getRecords().get("1996");
            case "1998":
                return getRecords().get("1998");
            case "2001":
                return getRecords().get("2001");
            case "2004":
                return getRecords().get("2004");
            case "2008":
                return getRecords().get("2008");
            case "2011":
                return getRecords().get("2011");
        }
        return "Not found!!";
    }

    private static String getAlbumInt(Integer year) {
        switch (year) {
            case 1983:
                return getRecords().get("1983");
            case 1984:
                return getRecords().get("1984");
            case 1985:
                return getRecords().get("1985");
            case 1986:
                return getRecords().get("1986");
            case 1987:
                return getRecords().get("1987");
            case 1988:
                return getRecords().get("1988");
            case 1991:
                return getRecords().get("1991");
            case 1992:
                return getRecords().get("1992");
            case 1994:
                return getRecords().get("1994");
            case 1996:
                return getRecords().get("1996");
            case 1998:
                return getRecords().get("1998");
            case 2001:
                return getRecords().get("2001");
            case 2004:
                return getRecords().get("2004");
            case 2008:
                return getRecords().get("2008");
            case 2011:
                return getRecords().get("2011");
        }

        return "Not found!!";
    }

    private static String getAlbumChar(int year) {
        switch (year - 1900) {
            case 'S':
                return getRecords().get("1983");
            case 'T':
                return getRecords().get("1984");
            case 'U':
                return getRecords().get("1985");
            case 'V':
                return getRecords().get("1986");
            case 'W':
                return getRecords().get("1987");
            case 'X':
                return getRecords().get("1988");
            case '[':
                return getRecords().get("1991");
            case '\\':
                return getRecords().get("1992");
            case '^':
                return getRecords().get("1994");
            case '`':
                return getRecords().get("1996");
            case 'b':
                return getRecords().get("1998");
            case 'e':
                return getRecords().get("2001");
            case 'h':
                return getRecords().get("2004");
            case 'l':
                return getRecords().get("2008");
            case 'o':
                return getRecords().get("2011");
        }

        return "Not found!!";
    }

    private static HashMap<String, String> getRecords() {
        final var records = new HashMap<String, String>();
        records.put("1983", "Murmur");
        records.put("1984", "Reckoning");
        records.put("1985", "Fables of the Reconstruction");
        records.put("1986", "Lifes Rich Pageant");
        records.put("1987", "Document");
        records.put("1988", "Green");
        records.put("1991", "Out of Time");
        records.put("1992", "Automatic for the People");
        records.put("1994", "Monster");
        records.put("1996", "New Adventures in Hi-Fi");
        records.put("1998", "Up");
        records.put("2001", "Reveal");
        records.put("2004", "Around the Sun");
        records.put("2008", "Accelerate");
        records.put("2011", "Collapse into Now");
        return records;
    }
}
