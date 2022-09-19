public class Converter {
    double oneStepKM = 0.00075;
    double conStepKM;
    double oneStepCal = 0.05;
    double conStepCal;
    double stepKM(int count){
        return conStepKM = oneStepKM * count;
    }

    double stepCal(int count){
        return conStepCal = oneStepCal * count;
    }
}
