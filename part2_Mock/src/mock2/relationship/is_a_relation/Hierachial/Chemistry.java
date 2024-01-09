package mock2.relationship.is_a_relation.Hierachial;

public class Chemistry extends Science {
    int cheMark;
    String cheTopic;
    Chemistry(){}
    Chemistry(int cheMark,String cheTopic,String science){
        super(science);
        this.cheMark=cheMark;
        this.cheTopic=cheTopic;

    }
}
