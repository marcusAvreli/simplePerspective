package simplePerspective.core.view.perspective;

import java.awt.Component;
import java.awt.Container;

import simplePerspective.ViewContainer;
import simplePerspective.api.view.perspective.Perspective;
import simplePerspective.api.view.perspective.PerspectiveConstraint;

public class DefaultPerspective implements Perspective {
	public static final String DEFAULT_PERSPECTIVE_ID = "DefaultPerspectiveID";
	private Component component;
	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void addView(ViewContainer view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Container arrange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addView(ViewContainer view, PerspectiveConstraint constraint) {
		// TODO Auto-generated method stub
			component = view.getComponent();
	}

}
