import java.time.MonthDay;

public class StepTracker {
    int month;
    int day;
    int step;
    int goalDef = 10000;

    Converter converter = new Converter();
    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        int[] days = new int[30];
    }



    void inUserStep(int month, int day, int step){
        monthToData[month].days[day-1] = step;
    }
    void printStatDay(int month){
        int count = 0;
        int max = 0;
        int countSet = 0;
        int maxSet = 0;

        for(int i = 0; i < monthToData[month].days.length; i++) {
            System.out.print((i+1) + " день: " + monthToData[month].days[i] + ", ");
            if(i == 29){
                System.out.println((i+1) + " день: " + monthToData[month].days[i] + ".");
            }
        }
        System.out.println();

        for(int i = 0; i < monthToData[month].days.length; i++) {
            count += monthToData[month].days[i];
        }
        System.out.println("Общее количество шагов за месяц: " + count);

        for(int i = 0; i < monthToData[month].days.length; i++) {
            if(max < monthToData[month].days[i]){
               max = monthToData[month].days[i];
            }
        }
        System.out.println("Максимальное количество шагов за месяц: " + max);

        System.out.println("Среднее количество шагов за месяц: " + (count/30));

        System.out.println("Пройденная дистанция (в км): " + converter.stepKM(count));

        System.out.println("Количество сожжённых килокалорий: " + converter.stepCal(count));

        for(int i = 0; i < monthToData[month].days.length; i++) {
            int[] setMax = new int[30];

            if ((monthToData[month].days[i] >= goalDef) && (monthToData[month].days[i + 1] >= goalDef)) {
                countSet++;
            } else if ((monthToData[month].days[i] >= goalDef) && (monthToData[month].days[i + 1] <= goalDef)) {
                countSet++;
            }

            if (monthToData[month].days[i] <= goalDef){
                for (int k = 0; k < setMax.length; k++){
                    setMax[k] = countSet;
                    if (maxSet < setMax[k]) {
                        maxSet = setMax[k];
                    }
                }
                countSet = 0;
            }
        }
        System.out.println("Лучшая серия: " + maxSet);
        System.out.println();
    }

    void goalStep(int goal){
        goalDef = goal;
    }
}
