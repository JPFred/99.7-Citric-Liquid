package cl.uchile.dcc.citricliquid.phases;

import cl.uchile.dcc.citricliquid.controller.GameController;

public class MovingPhase extends Phase{

    public MovingPhase() {
        this.canStart = false;
        this.canMove = false;
        this.canFight = false;
        this.stayHome = false;
        this.recover = false;
        this.waitHome = false;
        this.waitFight = false;
        this.waitPath = true;
        this.canEnd = false;
        this.battle = false;
    }

    @Override
    public String toString() {
        return "MovingPhase";
    }

    @Override
    public void setController(GameController controller) {
        super.setController(controller);
    }
}
