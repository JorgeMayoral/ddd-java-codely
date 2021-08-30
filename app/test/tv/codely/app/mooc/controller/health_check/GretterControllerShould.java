package tv.codely.app.mooc.controller.health_check;

import org.junit.jupiter.api.Test;
import tv.codely.app.mooc.controller.RequestTestCase;

public final class GretterControllerShould extends RequestTestCase {
    @Test
    public void check_greeter_returns_name() throws Exception {
        this.assertResponse("/greeter/Codely", 200, "{'hello': 'Codely'}");
    }
}
