import com.puppycrawl.tools.checkstyle.BaseCheckTestCase;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import com.puppycrawl.tools.checkstyle.checks.j2ee.EntityBeanFindByPrimaryKeyCheck;

public class EntityBeanFindByPrimaryKeyCheckTest
    extends BaseCheckTestCase
{
    public void testDefault()
            throws Exception
    {
        final DefaultConfiguration checkConfig =
            createCheckConfig(EntityBeanFindByPrimaryKeyCheck.class);
        final String[] expected = {
            "13:14: Entity bean must have method ejbFindByPrimaryKey.",
            "75:16: Entity bean must have method ejbFindByPrimaryKey.",
            "83:13: Entity bean must have method ejbFindByPrimaryKey.",
        };
        verify(checkConfig, getPath("InputEntityBean.java"), expected);
    }
}
