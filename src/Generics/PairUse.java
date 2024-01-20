package Generics;

public class PairUse {
    public static void main(String[] args) {

        Pair <Integer, String>p = new Pair<Integer, String>(10,"20");

        Pair<String, Float> ps = new Pair<String, Float>("hello",1.25f);

        Pair<Boolean, Double> pb = new Pair<Boolean,Double>(true,8502.6);

        Pair<Double,Float> pd = new Pair<Double,Float>(1.2,3.4f);

        Pair<String, Integer> pNo = new Pair<>();


        Pair<String, Integer> pInner1 = new Pair<>();
        Pair<Integer, Double> pInner2 = new Pair<>();


        Pair<Pair<String, Integer>, Pair<Integer, Double>> PSI = new Pair<>();

        PSI.setFirst(pInner1);
        PSI.setSecond(pInner2);

        pInner1.setFirst("firstSet");
        pInner1.setSecond(3);

        pInner2.setFirst(4);
        pInner2.setSecond(2.5);




        System.out.println(PSI.getFirst().getFirst());
        System.out.println(PSI.getFirst().getSecond());

        System.out.println(PSI.getSecond().getFirst());
        System.out.println(PSI.getSecond().getSecond());


//        System.out.println(pInner1.getFirst());
//        System.out.println(pInner.getSecond());


//
//
//
//
//
//        System.out.println(p.getFirst());
//        System.out.println(p.getSecond());
//
//        System.out.println(ps.getFirst());
//        System.out.println(ps.getSecond());
//
//        System.out.println(pb.getFirst());
//        System.out.println(pb.getSecond());
//
//        System.out.println(pd.getFirst());
//        System.out.println(pd.getSecond());


    }
}
