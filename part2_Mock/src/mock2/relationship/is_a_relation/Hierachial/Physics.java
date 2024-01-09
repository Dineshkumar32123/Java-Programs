package mock2.relationship.is_a_relation.Hierachial;

public class Physics extends Science {
    int phyMark;
    String phyTopic;

    Physics(){}

     Physics(String science, int phyMark, String phyTopic) {
        super(science);
        this.phyMark = phyMark;
        this.phyTopic = phyTopic;
    }
}
