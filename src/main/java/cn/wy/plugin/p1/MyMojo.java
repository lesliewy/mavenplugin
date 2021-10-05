package cn.wy.plugin.p1;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by leslie on 2020/8/21.
 */
// 生命周期的阶段phase与插件的目标goal相互绑定
@Mojo(name = "hello", defaultPhase = LifecyclePhase.CLEAN)
public class MyMojo extends AbstractMojo {
    @Parameter
    private String test;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println(" ---------->> Hello My Plugins = " + test);
    }
}
