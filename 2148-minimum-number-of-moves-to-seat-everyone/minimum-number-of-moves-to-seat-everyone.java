class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        int j = 0;
        for(int i = 0;i<seats.length;i++){
            sum += Math.abs(seats[i] - students[j]);
            j++;
        }
        return sum;

    }
}