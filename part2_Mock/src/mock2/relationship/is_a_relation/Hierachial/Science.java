package mock2.relationship.is_a_relation.Hierachial;

public class Science {
    String science;
    Science(){}
    Science(String science) {
        this.science = science;
    }


    public static void main(String[] args) {
        Science s = new Science("Science contains many subject like phy, che,bio");
        Physics p =new Physics("I'm branch from science..",85,"I'm good in physics");
        Chemistry ch = new Chemistry(83,"I'm little bit weak in componds topic ","I'm branch from science..");
        Biology b = new Biology(93,"I'm good in zoology ","I'm branch from science..");
        System.out.println();
        System.out.println(s.science);
        System.out.println("Physics: ");
        System.out.println(p.phyMark);
        System.out.println(p.phyTopic);
        System.out.println(p.science);
        System.out.println();
        System.out.println("Chemistry: ");
        System.out.println(ch.cheMark);
        System.out.println(ch.cheTopic);
        System.out.println(ch.science);
        System.out.println();
        System.out.println("Biology: ");
        System.out.println(b.bioMark);
        System.out.println(b.bioTopic);
        System.out.println(b.science);



    }

}
