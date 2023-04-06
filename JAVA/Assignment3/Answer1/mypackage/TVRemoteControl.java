package mypackage;

public class TVRemoteControl {
    private TV tv;
    
    public TVRemoteControl(TV tv) {
        this.tv = tv;
    }
    
    public void pressVolumeUpButton() {
        this.tv.volumeUp();
    }
    
    public void pressVolumeDownButton() {
        this.tv.volumeDown();
    }
    
    public void pressChannelPlusButton() {
        this.tv.channelPlus();
    }
    
    public void pressChannelMinusButton() {
        this.tv.channelMinus();
    }
}