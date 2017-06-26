package net.serenitybdd.screenplay.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.stream.Collectors;

public class SelectedVisibleTextValue extends TargetedUIState<String> {

    public SelectedVisibleTextValue(Target target, Actor actor) {
        super(target,actor);
    }

    public static UIStateReaderBuilder<SelectedVisibleTextValue> of(Target target) {
        return new UIStateReaderBuilder(target, SelectedVisibleTextValue.class);
    }

    public String resolve() {
        return target.resolveFor(actor).getSelectedVisibleTextValue();
    }

    public List<String> resolveAll() {
        return target.resolveAllFor(actor).stream()
                .map(WebElementFacade::getSelectedVisibleTextValue)
                .collect(Collectors.toList());
    }
}
