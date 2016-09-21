/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 *
 * @author user
 */
public class HeuristicManhatan implements Heuristic<TileNode>{
    
     public float estimate(TileNode n, TileNode n1) { 
    
    float dis_x = Math.abs(n.getPosition().x - n1.getPosition().y);
    float dis_y = Math.abs(n.getPosition().y - n1.getPosition().y);    
         
    return (dis_x+dis_y)/18;
    
    }
    
}
