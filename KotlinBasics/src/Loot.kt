enum class LootType {
    POTION, RING, ARMOR
}

data class Loot(val name: String, val type: LootType, val value: Double) {
    override fun toString(): String {
        return name;
    }
}