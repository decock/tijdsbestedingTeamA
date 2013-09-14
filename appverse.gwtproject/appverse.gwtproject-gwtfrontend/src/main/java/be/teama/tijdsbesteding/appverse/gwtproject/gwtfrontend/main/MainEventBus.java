package be.teama.tijdsbesteding.appverse.gwtproject.gwtfrontend.main;

import be.teama.tijdsbesteding.appverse.gwtproject.gwtfrontend.main.presenters.impl.live.MainModuleLayoutManagerPresenter;

import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.event.EventBus;

@Events(startPresenter = MainModuleLayoutManagerPresenter.class)
public interface MainEventBus extends EventBus {


}
