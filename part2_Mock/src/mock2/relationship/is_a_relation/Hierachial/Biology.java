package mock2.relationship.is_a_relation.Hierachial;

public class Biology extends Science {
    int bioMark;
    String bioTopic;

    Biology(){}
    Biology(int bioMark,String bioTopic,String science){
        super(science);
        this.bioMark=bioMark;
        this.bioTopic=bioTopic;
    }
}
