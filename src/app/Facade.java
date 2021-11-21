package app;

public class Facade {
    private Amplifier amplifier;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;
    private Tuner tuner;

    public Facade(Amplifier amplifier,
                  CdPlayer cdPlayer,
                  DvdPlayer dvdPlayer,
                  PopcornPopper popcornPopper,
                  Projector projector,
                  Screen screen,
                  TheaterLights theaterLights,
                  Tuner tuner
    ) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector - projector
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }


    //    To watch a movie we should:
//
//    turn popcorn popper on.
//    let the popcorn popper pop.
//    Dim the lights
//    Put the screen down
//    Put the projector on
//    and set it to wide screen mode
//    Put the amplifier on
//    insert an DVD in it
//    enable surround sound on
//    set the volume to 5
//    set the dvdplayer on
//    play the movie on the dvd player
    public void toWatchAMovie() {
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(1);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        dvdPlayer.play("No time to die");
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(0);
    }


    //    When we're ready watching the movie:
//
//    turn the popcorn popper off
//    put the lights on
//    roll up the screen
//    turn off the projector
//    turn off the amplifier
//    stop the dvd
//    eject dvd
//    turn off dvd player
    public void finishedWachtingMovie() {
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }


    //    To listen to the music we should:
//
//    put the lights on
//    put the amplifier on
//    set the volume of the amplifier to 5
//    insert a cd in the amplifier
//    and enable sterio sound
//    turn the cd player on
//    let the player play the cd
    public void toListenMusic() {
        theaterLights.on();
        amplifier.on();
        amplifier.setVolume(5);
        cdPlayer.play("No time to die");
        amplifier.setStereoSound();
        cdPlayer.on();
        cdPlayer.play(1);
    }


    //    When we're ready listening music:
//
//    turn the amplifier off
//    set the amplifier to cd mode
//    eject cd out of the cd player
//    turn off cd player
    public void finishedListeningMusic() {
        amplifier.off();
        amplifier.setCd(this.cdPlayer);
        cdPlayer.eject();
        cdPlayer.off();
    }


    //    To listen to the radio we should:
//
//    turn the tuner on
//    set the frequence to the required number
//    turn the amplifier on
//    set the amplifier volume to 5
//    set the amplifier to tuner mode
    public void toListenRadio() {
        tuner.on();
        tuner.setFrequency(101.30);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(this.tuner);
    }


    //    When we're ready listening music:
//
//    turn of the tuner
//    turn off the amplifier
    public void finishedListeningRadio() {
        tuner.off();
        amplifier.off();
    }


}
