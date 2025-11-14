
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastweek = {0, 2, 5, 3, 7, 8, 4};
        return lastweek;
    }

    public int getToday() {
        int arrayLength = birdsPerDay.length;
        int today = arrayLength - 1;
        return birdsPerDay[today];
    }

    public void incrementTodaysCount() {
        int length =  birdsPerDay.length - 1;
        birdsPerDay[length]+=1; 
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i<birdsPerDay.length; i++){
            if (birdsPerDay[i]== 0){
                return true;
            }
        }return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countTotal = 0;
        for(int i = 0; i<numberOfDays; i++){
            if (i < birdsPerDay.length){
                countTotal = countTotal +=birdsPerDay[i];
            }
        }return countTotal; 
    }

    public int getBusyDays() {
        int busyCount = 0;
        for (int i = 0; i<birdsPerDay.length; i++){
            if (birdsPerDay[i] >= 5){
            busyCount++;
            } 
        }return busyCount;
    }
}
