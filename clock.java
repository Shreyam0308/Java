class clock {
    public static void main(String[] args) {
        int sec = 3664;
        int hour = sec / 3600;
        sec = sec - (3600*hour);
        int min = sec / 60;
        sec = sec - (60*min);
        System.out.println(hour +" : " + min + " : " + sec);
    }    
}
