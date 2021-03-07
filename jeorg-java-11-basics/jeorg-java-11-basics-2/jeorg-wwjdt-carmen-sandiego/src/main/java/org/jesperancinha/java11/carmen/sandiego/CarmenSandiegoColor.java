package org.jesperancinha.java11.carmen.sandiego;

public enum CarmenSandiegoColor {
    BLACK("000000", "\033[0;30m"),
    BLUE("0000AA", "\033[0;31m"),
    GREEN("00AA00", "\033[0;32m"),
    CYAN("00AAAA", "\033[0;36m"),
    RED("AA0000", "\033[0;31m"),
    MAGENTA("AA00AA", "\033[0;35m"),
    BROWN("AA5500", "\033[0;33m"),
    LIGHT_GREY("AAAAAA", "\033[0;37m"),
    DARK_GREY("555555", "\033[0;90m"),
    BRIGHT_BLUE("5555FF", "\033[1;34m"),
    BRIGHT_GREEN("55FF55", "\033[1;32m"),
    BRIGHT_CYAN("55FFFF", "\033[1;36m"),
    BRIGHT_RED("FF5555", "\033[1;31m"),
    BRIGHT_MAGENTA("FF55FF", "\033[0;95m"),
    YELLOW("FFFF55", "\033[0;33m"),
    BRIGHT_WHITE("FFFFFF", "\033[1;37m");

    private String hexColor;
    private String consoleColor;

    CarmenSandiegoColor(String hexColor, String consoleColor) {
        this.hexColor = hexColor;
        this.consoleColor = consoleColor;
    }

    public String getConsoleColor() {
        return consoleColor;
    }

    public String getHexColor() {
        return hexColor;
    }
}
