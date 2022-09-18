public class Converter {
    double oneStepKM = 0.00075;
    double oneStepCal = 0.05;
    double conStepKM;
    double conStepCal;


    double stepKM(int count){
        return conStepKM = oneStepKM * count;
    }

    double stepCal(int count){
        return conStepCal = oneStepCal * count;
    }
}
