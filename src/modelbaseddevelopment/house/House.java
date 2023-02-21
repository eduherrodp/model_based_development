package modelbaseddevelopment.house;

class House {
    private boolean lightsOn;
    private boolean doorOpen;

    public boolean areLightsOn() {
        return lightsOn;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }
}
