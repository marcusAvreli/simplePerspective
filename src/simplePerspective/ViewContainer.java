package simplePerspective;

import java.awt.Component;

import javax.swing.RootPaneContainer;

public interface ViewContainer extends RootPaneContainer{
	public Component getComponent();
	public void setComponent(Component component);
}
