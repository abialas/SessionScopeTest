package com.us;

import com.sun.deploy.net.HttpRequest;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

/**
 * Created by adam.
 */
public class SessionValidationListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        HttpSession session = (HttpSession) phaseEvent.getFacesContext().getExternalContext().getSession(false);
        System.out.println("After Phase: session valid: " + session);
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        HttpSession session = (HttpSession) phaseEvent.getFacesContext().getExternalContext().getSession(false);
        System.out.println("Before Phase: session valid: " + session);
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
