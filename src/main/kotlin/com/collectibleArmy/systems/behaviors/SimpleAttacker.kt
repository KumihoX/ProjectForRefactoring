package com.collectibleArmy.systems.behaviors

import com.collectibleArmy.attributes.types.Combatant
import com.collectibleArmy.extensions.*
import com.collectibleArmy.game.GameContext
import org.hexworks.amethyst.api.entity.EntityType
import org.hexworks.cobalt.logging.api.LoggerFactory

object SimpleAttacker : GlobalBehavior() {
    private val logger = LoggerFactory.getLogger(this::class)

    override fun action(entity: GameEntity<EntityType>, context: GameContext) {
        entity.whenTypeIs<Combatant> {
            it.tryToAttack(entity.position.forward(entity.faction), context)
        }
    }

}