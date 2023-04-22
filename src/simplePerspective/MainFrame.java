package simplePerspective;

import javax.swing.JFrame;
import javax.swing.JLabel;

import simplePerspective.api.view.perspective.PerspectiveConstraint;
import simplePerspective.core.view.AbstractViewContainer;
import simplePerspective.core.view.DefaultViewContainer;
import simplePerspective.core.view.DefaultViewManager;
import simplePerspective.core.view.perspective.DefaultPerspective;

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/core/src/main/java/org/viewaframework/core/AbstractApplication.java
public class MainFrame  extends JFrame{
	private ViewManager 				viewManager;
	public MainFrame() {
		
		initComponents();
	}
	
	public void initComponents() {

	     setExtendedState(MAXIMIZED_BOTH);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 AbstractViewContainer viewContainer = new DefaultViewContainer();

		 JLabel lbl = new JLabel("test");

		 this.viewManager 			= new DefaultViewManager(this,new DefaultPerspective());
		 viewContainer.setComponent(lbl);
		
		 //viewManager.setFrame(this);
		 viewManager.addView(viewContainer,PerspectiveConstraint.LEFT);
	}
}
