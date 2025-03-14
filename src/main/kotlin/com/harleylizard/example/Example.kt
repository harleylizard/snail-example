package com.harleylizard.example

import net.fabricmc.api.ModInitializer
import net.minecraft.resources.ResourceLocation

class Example : ModInitializer {
    override fun onInitialize() {
    }

    companion object {
        private const val MOD_ID = "example"

        val String.asResourceLocation: ResourceLocation get() = ResourceLocation.fromNamespaceAndPath(MOD_ID, this)
    }
}