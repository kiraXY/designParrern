package Strategy;

import org.junit.Test;

/**
 * Created by wangning on 2017/2/13.
 */
public class testStrategy {


    @Test
    public void asd(){
        Context context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }

}
