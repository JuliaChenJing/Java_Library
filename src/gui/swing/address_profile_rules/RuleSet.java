package gui.swing.address_profile_rules;
import java.awt.Component;


public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
