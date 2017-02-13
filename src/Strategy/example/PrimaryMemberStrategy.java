package Strategy.example;

/**
 * Created by wangning on 2017/2/13.
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("初级会员没有折扣");
        return booksPrice;
    }
}
