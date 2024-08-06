public class LogLevels {
    
    public static String message(String logLine) {
        String str = logLine;
        if(logLine.contains(" ")){
            str = str.substring(str.indexOf(" "));
        }
        return str.trim();
    }

    public static String logLevel(String logLine) {
        if(logLine.contains(" ")){
            logLine = logLine.substring(1, logLine.indexOf(" ")-2);
        }
        logLine = logLine.toLowerCase();
        return logLine;
    }

    public static String reformat(String logLine) {
        String str1 ="", str2= "";
        if(logLine.contains(" ")){
            str1 = logLine.substring(1, logLine.indexOf(" ")-2);
            str2 = logLine.substring(logLine.indexOf(" "));
        }
        str1 = str1.toLowerCase();
        str1 = str1.trim();
        str2 = str2.trim();
        str1 = "(" +str1 +")";
        return str2 +" " +str1;
    }
}

