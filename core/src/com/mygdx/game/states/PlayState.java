package com.mygdx.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

/**
 * Created by Kassu on 9.11.2017.
 */

public class PlayState extends State {

    private OrthogonalTiledMapRenderer tmr;
    private TiledMap map;

    protected PlayState(GameStateManager gsm) {
        super(gsm);
    }

    @Override
    public void create() {
        map = new TmxMapLoader().load("omg.tmx");
        tmr = new OrthogonalTiledMapRenderer(map);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        tmr.render();
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.end();

    }

    @Override
    public void dispose() {
        tmr.dispose();
        map.dispose();
    }
}
