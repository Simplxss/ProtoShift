// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityInvokeArgument.proto

package emu.protoshift.net.oldproto;

public final class AbilityInvokeArgumentOuterClass {
  private AbilityInvokeArgumentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AbilityInvokeArgument}
   */
  public enum AbilityInvokeArgument
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_NONE = 0;</code>
     */
    ABILITY_INVOKE_ARGUMENT_NONE(0),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_MODIFIER_CHANGE = 1;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_MODIFIER_CHANGE(1),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_COMMAND_MODIFIER_CHANGE_REQUEST = 2;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_COMMAND_MODIFIER_CHANGE_REQUEST(2),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SPECIAL_FLOAT_ARGUMENT = 3;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_SPECIAL_FLOAT_ARGUMENT(3),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_OVERRIDE_PARAM = 4;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_OVERRIDE_PARAM(4),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_CLEAR_OVERRIDE_PARAM = 5;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_CLEAR_OVERRIDE_PARAM(5),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_REINIT_OVERRIDEMAP = 6;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_REINIT_OVERRIDEMAP(6),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_GLOBAL_FLOAT_VALUE = 7;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_GLOBAL_FLOAT_VALUE(7),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_CLEAR_GLOBAL_FLOAT_VALUE = 8;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_CLEAR_GLOBAL_FLOAT_VALUE(8),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_ABILITY_ELEMENT_STRENGTH = 9;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_ABILITY_ELEMENT_STRENGTH(9),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_ADD_OR_GET_ABILITY_AND_TRIGGER = 10;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_ADD_OR_GET_ABILITY_AND_TRIGGER(10),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SET_KILLED_SETATE = 11;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_SET_KILLED_SETATE(11),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SET_ABILITY_TRIGGER = 12;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_SET_ABILITY_TRIGGER(12),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_ADD_NEW_ABILITY = 13;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_ADD_NEW_ABILITY(13),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_REMOVE_ABILITY = 14;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_REMOVE_ABILITY(14),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SET_MODIFIER_APPLY_ENTITY = 15;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_SET_MODIFIER_APPLY_ENTITY(15),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_MODIFIER_DURABILITY_CHANGE = 16;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_MODIFIER_DURABILITY_CHANGE(16),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_ELEMENT_REACTION_VISUAL = 17;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_ELEMENT_REACTION_VISUAL(17),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SET_POSE_PARAMETER = 18;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_SET_POSE_PARAMETER(18),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_UPDATE_BASE_REACTION_DAMAGE = 19;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_UPDATE_BASE_REACTION_DAMAGE(19),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ELEMENT_REACTION = 20;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ELEMENT_REACTION(20),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_LOSE_HP = 21;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_LOSE_HP(21),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_DURABILITY_IS_ZERO = 22;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_DURABILITY_IS_ZERO(22),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ARKHE_REACTION = 23;</code>
     */
    ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ARKHE_REACTION(23),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_TRIGGER_ABILITY = 50;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_TRIGGER_ABILITY(50),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SET_CRASH_DAMAGE = 51;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_SET_CRASH_DAMAGE(51),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_EFFECT = 52;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_EFFECT(52),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SUMMON = 53;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_SUMMON(53),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_BLINK = 54;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_BLINK(54),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_GADGET = 55;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_GADGET(55),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_APPLY_LEVEL_MODIFIER = 56;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_APPLY_LEVEL_MODIFIER(56),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_GENERATE_ELEM_BALL = 57;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_GENERATE_ELEM_BALL(57),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SET_RANDOM_OVERRIDE_MAP_VALUE = 58;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_SET_RANDOM_OVERRIDE_MAP_VALUE(58),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SERVER_MONSTER_LOG = 59;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_SERVER_MONSTER_LOG(59),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_TILE = 60;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_TILE(60),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_DESTROY_TILE = 61;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_DESTROY_TILE(61),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_FIRE_AFTER_IMAGE = 62;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_FIRE_AFTER_IMAGE(62),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_DEDUCT_STAMINA = 63;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_DEDUCT_STAMINA(63),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_HIT_EFFECT = 64;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_HIT_EFFECT(64),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SET_BULLET_TRACK_TARGET = 65;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_SET_BULLET_TRACK_TARGET(65),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_FIREWORK_EFFECT = 66;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_FIREWORK_EFFECT(66),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_LEVEL_BANK_ADD_STUFF = 67;</code>
     */
    ABILITY_INVOKE_ARGUMENT_ACTION_LEVEL_BANK_ADD_STUFF(67),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_STEER_BY_CAMERA = 100;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_STEER_BY_CAMERA(100),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_MONSTER_DEFEND = 101;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_MONSTER_DEFEND(101),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_ZONE = 102;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_ZONE(102),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_COST_STAMINA = 103;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_COST_STAMINA(103),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ELITE_SHIELD = 104;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_ELITE_SHIELD(104),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ELEMENT_SHIELD = 105;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_ELEMENT_SHIELD(105),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_GLOBAL_SHIELD = 106;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_GLOBAL_SHIELD(106),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_SHIELD_BAR = 107;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_SHIELD_BAR(107),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_SEED_SPAWNER = 108;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_SEED_SPAWNER(108),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_ELEMENT_REACTION = 109;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_ELEMENT_REACTION(109),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_FIELD_ENTITY_COUNT_CHANGE = 110;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_FIELD_ENTITY_COUNT_CHANGE(110),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_SCENE_PROP_SYNC = 111;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_SCENE_PROP_SYNC(111),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_WIDGET_MP_SUPPORT = 112;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_WIDGET_MP_SUPPORT(112),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_SELF_MODIFIER_ELEMENT_DURABILITY_RATIO = 113;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_SELF_MODIFIER_ELEMENT_DURABILITY_RATIO(113),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_FIREWORKS_LAUNCHER = 114;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_FIREWORKS_LAUNCHER(114),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ATTACK_RESULT_CREATE_COUNT = 115;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_ATTACK_RESULT_CREATE_COUNT(115),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_UGC_TIME_CONTROL = 116;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_UGC_TIME_CONTROL(116),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_COMBAT = 117;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_COMBAT(117),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_DEATH_ZONE_REGIONAL_PLAY_MIXIN = 118;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_DEATH_ZONE_REGIONAL_PLAY_MIXIN(118),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_UI_INTERACT = 119;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_UI_INTERACT(119),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_SHOOT_FROM_CAMERA = 120;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_SHOOT_FROM_CAMERA(120),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ERASE_BRICK_ACTIVITY = 121;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_ERASE_BRICK_ACTIVITY(121),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_BREAKOUT = 122;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_BREAKOUT(122),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_DAMAGE_LOAN = 123;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_DAMAGE_LOAN(123),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_BROADCAST_GV = 124;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_BROADCAST_GV(124),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_RECEIVE_GV = 125;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_RECEIVE_GV(125),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_RAYCAST_SELECT_TARGET = 126;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_RAYCAST_SELECT_TARGET(126),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ENERGY_CRYSTAL_TARGET = 127;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_ENERGY_CRYSTAL_TARGET(127),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ROTATION_FOLLOW_CAMERA = 128;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_ROTATION_FOLLOW_CAMERA(128),
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_BUOYANT_FORCE = 129;</code>
     */
    ABILITY_INVOKE_ARGUMENT_MIXIN_BUOYANT_FORCE(129),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ABILITY_INVOKE_ARGUMENT_NONE = 0;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_NONE_VALUE = 0;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_MODIFIER_CHANGE = 1;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_MODIFIER_CHANGE_VALUE = 1;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_COMMAND_MODIFIER_CHANGE_REQUEST = 2;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_COMMAND_MODIFIER_CHANGE_REQUEST_VALUE = 2;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SPECIAL_FLOAT_ARGUMENT = 3;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_SPECIAL_FLOAT_ARGUMENT_VALUE = 3;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_OVERRIDE_PARAM = 4;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_OVERRIDE_PARAM_VALUE = 4;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_CLEAR_OVERRIDE_PARAM = 5;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_CLEAR_OVERRIDE_PARAM_VALUE = 5;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_REINIT_OVERRIDEMAP = 6;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_REINIT_OVERRIDEMAP_VALUE = 6;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_GLOBAL_FLOAT_VALUE = 7;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_GLOBAL_FLOAT_VALUE_VALUE = 7;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_CLEAR_GLOBAL_FLOAT_VALUE = 8;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_CLEAR_GLOBAL_FLOAT_VALUE_VALUE = 8;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_ABILITY_ELEMENT_STRENGTH = 9;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_ABILITY_ELEMENT_STRENGTH_VALUE = 9;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_ADD_OR_GET_ABILITY_AND_TRIGGER = 10;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_ADD_OR_GET_ABILITY_AND_TRIGGER_VALUE = 10;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SET_KILLED_SETATE = 11;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_SET_KILLED_SETATE_VALUE = 11;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SET_ABILITY_TRIGGER = 12;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_SET_ABILITY_TRIGGER_VALUE = 12;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_ADD_NEW_ABILITY = 13;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_ADD_NEW_ABILITY_VALUE = 13;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_REMOVE_ABILITY = 14;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_REMOVE_ABILITY_VALUE = 14;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SET_MODIFIER_APPLY_ENTITY = 15;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_SET_MODIFIER_APPLY_ENTITY_VALUE = 15;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_MODIFIER_DURABILITY_CHANGE = 16;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_MODIFIER_DURABILITY_CHANGE_VALUE = 16;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_ELEMENT_REACTION_VISUAL = 17;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_ELEMENT_REACTION_VISUAL_VALUE = 17;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_SET_POSE_PARAMETER = 18;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_SET_POSE_PARAMETER_VALUE = 18;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_UPDATE_BASE_REACTION_DAMAGE = 19;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_UPDATE_BASE_REACTION_DAMAGE_VALUE = 19;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ELEMENT_REACTION = 20;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ELEMENT_REACTION_VALUE = 20;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_LOSE_HP = 21;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_LOSE_HP_VALUE = 21;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_DURABILITY_IS_ZERO = 22;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_DURABILITY_IS_ZERO_VALUE = 22;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ARKHE_REACTION = 23;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ARKHE_REACTION_VALUE = 23;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_TRIGGER_ABILITY = 50;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_TRIGGER_ABILITY_VALUE = 50;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SET_CRASH_DAMAGE = 51;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_SET_CRASH_DAMAGE_VALUE = 51;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_EFFECT = 52;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_EFFECT_VALUE = 52;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SUMMON = 53;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_SUMMON_VALUE = 53;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_BLINK = 54;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_BLINK_VALUE = 54;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_GADGET = 55;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_GADGET_VALUE = 55;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_APPLY_LEVEL_MODIFIER = 56;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_APPLY_LEVEL_MODIFIER_VALUE = 56;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_GENERATE_ELEM_BALL = 57;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_GENERATE_ELEM_BALL_VALUE = 57;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SET_RANDOM_OVERRIDE_MAP_VALUE = 58;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_SET_RANDOM_OVERRIDE_MAP_VALUE_VALUE = 58;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SERVER_MONSTER_LOG = 59;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_SERVER_MONSTER_LOG_VALUE = 59;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_TILE = 60;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_TILE_VALUE = 60;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_DESTROY_TILE = 61;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_DESTROY_TILE_VALUE = 61;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_FIRE_AFTER_IMAGE = 62;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_FIRE_AFTER_IMAGE_VALUE = 62;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_DEDUCT_STAMINA = 63;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_DEDUCT_STAMINA_VALUE = 63;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_HIT_EFFECT = 64;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_HIT_EFFECT_VALUE = 64;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_SET_BULLET_TRACK_TARGET = 65;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_SET_BULLET_TRACK_TARGET_VALUE = 65;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_FIREWORK_EFFECT = 66;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_FIREWORK_EFFECT_VALUE = 66;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_ACTION_LEVEL_BANK_ADD_STUFF = 67;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_ACTION_LEVEL_BANK_ADD_STUFF_VALUE = 67;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_STEER_BY_CAMERA = 100;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_STEER_BY_CAMERA_VALUE = 100;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_MONSTER_DEFEND = 101;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_MONSTER_DEFEND_VALUE = 101;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_ZONE = 102;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_ZONE_VALUE = 102;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_COST_STAMINA = 103;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_COST_STAMINA_VALUE = 103;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ELITE_SHIELD = 104;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_ELITE_SHIELD_VALUE = 104;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ELEMENT_SHIELD = 105;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_ELEMENT_SHIELD_VALUE = 105;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_GLOBAL_SHIELD = 106;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_GLOBAL_SHIELD_VALUE = 106;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_SHIELD_BAR = 107;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_SHIELD_BAR_VALUE = 107;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_SEED_SPAWNER = 108;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_SEED_SPAWNER_VALUE = 108;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_ELEMENT_REACTION = 109;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_ELEMENT_REACTION_VALUE = 109;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_FIELD_ENTITY_COUNT_CHANGE = 110;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_FIELD_ENTITY_COUNT_CHANGE_VALUE = 110;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_SCENE_PROP_SYNC = 111;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_SCENE_PROP_SYNC_VALUE = 111;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_WIDGET_MP_SUPPORT = 112;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_WIDGET_MP_SUPPORT_VALUE = 112;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_SELF_MODIFIER_ELEMENT_DURABILITY_RATIO = 113;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_SELF_MODIFIER_ELEMENT_DURABILITY_RATIO_VALUE = 113;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_FIREWORKS_LAUNCHER = 114;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_FIREWORKS_LAUNCHER_VALUE = 114;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ATTACK_RESULT_CREATE_COUNT = 115;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_ATTACK_RESULT_CREATE_COUNT_VALUE = 115;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_UGC_TIME_CONTROL = 116;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_UGC_TIME_CONTROL_VALUE = 116;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_COMBAT = 117;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_COMBAT_VALUE = 117;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_DEATH_ZONE_REGIONAL_PLAY_MIXIN = 118;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_DEATH_ZONE_REGIONAL_PLAY_MIXIN_VALUE = 118;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_UI_INTERACT = 119;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_UI_INTERACT_VALUE = 119;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_SHOOT_FROM_CAMERA = 120;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_SHOOT_FROM_CAMERA_VALUE = 120;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ERASE_BRICK_ACTIVITY = 121;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_ERASE_BRICK_ACTIVITY_VALUE = 121;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_BREAKOUT = 122;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_BREAKOUT_VALUE = 122;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_DAMAGE_LOAN = 123;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_DAMAGE_LOAN_VALUE = 123;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_BROADCAST_GV = 124;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_BROADCAST_GV_VALUE = 124;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_RECEIVE_GV = 125;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_RECEIVE_GV_VALUE = 125;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_RAYCAST_SELECT_TARGET = 126;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_RAYCAST_SELECT_TARGET_VALUE = 126;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ENERGY_CRYSTAL_TARGET = 127;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_ENERGY_CRYSTAL_TARGET_VALUE = 127;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_ROTATION_FOLLOW_CAMERA = 128;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_ROTATION_FOLLOW_CAMERA_VALUE = 128;
    /**
     * <code>ABILITY_INVOKE_ARGUMENT_MIXIN_BUOYANT_FORCE = 129;</code>
     */
    public static final int ABILITY_INVOKE_ARGUMENT_MIXIN_BUOYANT_FORCE_VALUE = 129;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AbilityInvokeArgument valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AbilityInvokeArgument forNumber(int value) {
      switch (value) {
        case 0: return ABILITY_INVOKE_ARGUMENT_NONE;
        case 1: return ABILITY_INVOKE_ARGUMENT_META_MODIFIER_CHANGE;
        case 2: return ABILITY_INVOKE_ARGUMENT_META_COMMAND_MODIFIER_CHANGE_REQUEST;
        case 3: return ABILITY_INVOKE_ARGUMENT_META_SPECIAL_FLOAT_ARGUMENT;
        case 4: return ABILITY_INVOKE_ARGUMENT_META_OVERRIDE_PARAM;
        case 5: return ABILITY_INVOKE_ARGUMENT_META_CLEAR_OVERRIDE_PARAM;
        case 6: return ABILITY_INVOKE_ARGUMENT_META_REINIT_OVERRIDEMAP;
        case 7: return ABILITY_INVOKE_ARGUMENT_META_GLOBAL_FLOAT_VALUE;
        case 8: return ABILITY_INVOKE_ARGUMENT_META_CLEAR_GLOBAL_FLOAT_VALUE;
        case 9: return ABILITY_INVOKE_ARGUMENT_META_ABILITY_ELEMENT_STRENGTH;
        case 10: return ABILITY_INVOKE_ARGUMENT_META_ADD_OR_GET_ABILITY_AND_TRIGGER;
        case 11: return ABILITY_INVOKE_ARGUMENT_META_SET_KILLED_SETATE;
        case 12: return ABILITY_INVOKE_ARGUMENT_META_SET_ABILITY_TRIGGER;
        case 13: return ABILITY_INVOKE_ARGUMENT_META_ADD_NEW_ABILITY;
        case 14: return ABILITY_INVOKE_ARGUMENT_META_REMOVE_ABILITY;
        case 15: return ABILITY_INVOKE_ARGUMENT_META_SET_MODIFIER_APPLY_ENTITY;
        case 16: return ABILITY_INVOKE_ARGUMENT_META_MODIFIER_DURABILITY_CHANGE;
        case 17: return ABILITY_INVOKE_ARGUMENT_META_ELEMENT_REACTION_VISUAL;
        case 18: return ABILITY_INVOKE_ARGUMENT_META_SET_POSE_PARAMETER;
        case 19: return ABILITY_INVOKE_ARGUMENT_META_UPDATE_BASE_REACTION_DAMAGE;
        case 20: return ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ELEMENT_REACTION;
        case 21: return ABILITY_INVOKE_ARGUMENT_META_LOSE_HP;
        case 22: return ABILITY_INVOKE_ARGUMENT_META_DURABILITY_IS_ZERO;
        case 23: return ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ARKHE_REACTION;
        case 50: return ABILITY_INVOKE_ARGUMENT_ACTION_TRIGGER_ABILITY;
        case 51: return ABILITY_INVOKE_ARGUMENT_ACTION_SET_CRASH_DAMAGE;
        case 52: return ABILITY_INVOKE_ARGUMENT_ACTION_EFFECT;
        case 53: return ABILITY_INVOKE_ARGUMENT_ACTION_SUMMON;
        case 54: return ABILITY_INVOKE_ARGUMENT_ACTION_BLINK;
        case 55: return ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_GADGET;
        case 56: return ABILITY_INVOKE_ARGUMENT_ACTION_APPLY_LEVEL_MODIFIER;
        case 57: return ABILITY_INVOKE_ARGUMENT_ACTION_GENERATE_ELEM_BALL;
        case 58: return ABILITY_INVOKE_ARGUMENT_ACTION_SET_RANDOM_OVERRIDE_MAP_VALUE;
        case 59: return ABILITY_INVOKE_ARGUMENT_ACTION_SERVER_MONSTER_LOG;
        case 60: return ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_TILE;
        case 61: return ABILITY_INVOKE_ARGUMENT_ACTION_DESTROY_TILE;
        case 62: return ABILITY_INVOKE_ARGUMENT_ACTION_FIRE_AFTER_IMAGE;
        case 63: return ABILITY_INVOKE_ARGUMENT_ACTION_DEDUCT_STAMINA;
        case 64: return ABILITY_INVOKE_ARGUMENT_ACTION_HIT_EFFECT;
        case 65: return ABILITY_INVOKE_ARGUMENT_ACTION_SET_BULLET_TRACK_TARGET;
        case 66: return ABILITY_INVOKE_ARGUMENT_ACTION_FIREWORK_EFFECT;
        case 67: return ABILITY_INVOKE_ARGUMENT_ACTION_LEVEL_BANK_ADD_STUFF;
        case 100: return ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_STEER_BY_CAMERA;
        case 101: return ABILITY_INVOKE_ARGUMENT_MIXIN_MONSTER_DEFEND;
        case 102: return ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_ZONE;
        case 103: return ABILITY_INVOKE_ARGUMENT_MIXIN_COST_STAMINA;
        case 104: return ABILITY_INVOKE_ARGUMENT_MIXIN_ELITE_SHIELD;
        case 105: return ABILITY_INVOKE_ARGUMENT_MIXIN_ELEMENT_SHIELD;
        case 106: return ABILITY_INVOKE_ARGUMENT_MIXIN_GLOBAL_SHIELD;
        case 107: return ABILITY_INVOKE_ARGUMENT_MIXIN_SHIELD_BAR;
        case 108: return ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_SEED_SPAWNER;
        case 109: return ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_ELEMENT_REACTION;
        case 110: return ABILITY_INVOKE_ARGUMENT_MIXIN_FIELD_ENTITY_COUNT_CHANGE;
        case 111: return ABILITY_INVOKE_ARGUMENT_MIXIN_SCENE_PROP_SYNC;
        case 112: return ABILITY_INVOKE_ARGUMENT_MIXIN_WIDGET_MP_SUPPORT;
        case 113: return ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_SELF_MODIFIER_ELEMENT_DURABILITY_RATIO;
        case 114: return ABILITY_INVOKE_ARGUMENT_MIXIN_FIREWORKS_LAUNCHER;
        case 115: return ABILITY_INVOKE_ARGUMENT_MIXIN_ATTACK_RESULT_CREATE_COUNT;
        case 116: return ABILITY_INVOKE_ARGUMENT_MIXIN_UGC_TIME_CONTROL;
        case 117: return ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_COMBAT;
        case 118: return ABILITY_INVOKE_ARGUMENT_MIXIN_DEATH_ZONE_REGIONAL_PLAY_MIXIN;
        case 119: return ABILITY_INVOKE_ARGUMENT_MIXIN_UI_INTERACT;
        case 120: return ABILITY_INVOKE_ARGUMENT_MIXIN_SHOOT_FROM_CAMERA;
        case 121: return ABILITY_INVOKE_ARGUMENT_MIXIN_ERASE_BRICK_ACTIVITY;
        case 122: return ABILITY_INVOKE_ARGUMENT_MIXIN_BREAKOUT;
        case 123: return ABILITY_INVOKE_ARGUMENT_MIXIN_DAMAGE_LOAN;
        case 124: return ABILITY_INVOKE_ARGUMENT_MIXIN_BROADCAST_GV;
        case 125: return ABILITY_INVOKE_ARGUMENT_MIXIN_RECEIVE_GV;
        case 126: return ABILITY_INVOKE_ARGUMENT_MIXIN_RAYCAST_SELECT_TARGET;
        case 127: return ABILITY_INVOKE_ARGUMENT_MIXIN_ENERGY_CRYSTAL_TARGET;
        case 128: return ABILITY_INVOKE_ARGUMENT_MIXIN_ROTATION_FOLLOW_CAMERA;
        case 129: return ABILITY_INVOKE_ARGUMENT_MIXIN_BUOYANT_FORCE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AbilityInvokeArgument>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AbilityInvokeArgument> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AbilityInvokeArgument>() {
            public AbilityInvokeArgument findValueByNumber(int number) {
              return AbilityInvokeArgument.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.AbilityInvokeArgumentOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AbilityInvokeArgument[] VALUES = values();

    public static AbilityInvokeArgument valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AbilityInvokeArgument(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AbilityInvokeArgument)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AbilityInvokeArgument.proto*\245\036\n\025Abilit" +
      "yInvokeArgument\022 \n\034ABILITY_INVOKE_ARGUME" +
      "NT_NONE\020\000\0220\n,ABILITY_INVOKE_ARGUMENT_MET" +
      "A_MODIFIER_CHANGE\020\001\022@\n<ABILITY_INVOKE_AR" +
      "GUMENT_META_COMMAND_MODIFIER_CHANGE_REQU" +
      "EST\020\002\0227\n3ABILITY_INVOKE_ARGUMENT_META_SP" +
      "ECIAL_FLOAT_ARGUMENT\020\003\022/\n+ABILITY_INVOKE" +
      "_ARGUMENT_META_OVERRIDE_PARAM\020\004\0225\n1ABILI" +
      "TY_INVOKE_ARGUMENT_META_CLEAR_OVERRIDE_P" +
      "ARAM\020\005\0223\n/ABILITY_INVOKE_ARGUMENT_META_R" +
      "EINIT_OVERRIDEMAP\020\006\0223\n/ABILITY_INVOKE_AR" +
      "GUMENT_META_GLOBAL_FLOAT_VALUE\020\007\0229\n5ABIL" +
      "ITY_INVOKE_ARGUMENT_META_CLEAR_GLOBAL_FL" +
      "OAT_VALUE\020\010\0229\n5ABILITY_INVOKE_ARGUMENT_M" +
      "ETA_ABILITY_ELEMENT_STRENGTH\020\t\022?\n;ABILIT" +
      "Y_INVOKE_ARGUMENT_META_ADD_OR_GET_ABILIT" +
      "Y_AND_TRIGGER\020\n\0222\n.ABILITY_INVOKE_ARGUME" +
      "NT_META_SET_KILLED_SETATE\020\013\0224\n0ABILITY_I" +
      "NVOKE_ARGUMENT_META_SET_ABILITY_TRIGGER\020" +
      "\014\0220\n,ABILITY_INVOKE_ARGUMENT_META_ADD_NE" +
      "W_ABILITY\020\r\022/\n+ABILITY_INVOKE_ARGUMENT_M" +
      "ETA_REMOVE_ABILITY\020\016\022:\n6ABILITY_INVOKE_A" +
      "RGUMENT_META_SET_MODIFIER_APPLY_ENTITY\020\017" +
      "\022;\n7ABILITY_INVOKE_ARGUMENT_META_MODIFIE" +
      "R_DURABILITY_CHANGE\020\020\0228\n4ABILITY_INVOKE_" +
      "ARGUMENT_META_ELEMENT_REACTION_VISUAL\020\021\022" +
      "3\n/ABILITY_INVOKE_ARGUMENT_META_SET_POSE" +
      "_PARAMETER\020\022\022<\n8ABILITY_INVOKE_ARGUMENT_" +
      "META_UPDATE_BASE_REACTION_DAMAGE\020\023\0229\n5AB" +
      "ILITY_INVOKE_ARGUMENT_META_TRIGGER_ELEME" +
      "NT_REACTION\020\024\022(\n$ABILITY_INVOKE_ARGUMENT" +
      "_META_LOSE_HP\020\025\0223\n/ABILITY_INVOKE_ARGUME" +
      "NT_META_DURABILITY_IS_ZERO\020\026\0227\n3ABILITY_" +
      "INVOKE_ARGUMENT_META_TRIGGER_ARKHE_REACT" +
      "ION\020\027\0222\n.ABILITY_INVOKE_ARGUMENT_ACTION_" +
      "TRIGGER_ABILITY\0202\0223\n/ABILITY_INVOKE_ARGU" +
      "MENT_ACTION_SET_CRASH_DAMAGE\0203\022)\n%ABILIT" +
      "Y_INVOKE_ARGUMENT_ACTION_EFFECT\0204\022)\n%ABI" +
      "LITY_INVOKE_ARGUMENT_ACTION_SUMMON\0205\022(\n$" +
      "ABILITY_INVOKE_ARGUMENT_ACTION_BLINK\0206\0220" +
      "\n,ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_" +
      "GADGET\0207\0227\n3ABILITY_INVOKE_ARGUMENT_ACTI" +
      "ON_APPLY_LEVEL_MODIFIER\0208\0225\n1ABILITY_INV" +
      "OKE_ARGUMENT_ACTION_GENERATE_ELEM_BALL\0209" +
      "\022@\n<ABILITY_INVOKE_ARGUMENT_ACTION_SET_R" +
      "ANDOM_OVERRIDE_MAP_VALUE\020:\0225\n1ABILITY_IN" +
      "VOKE_ARGUMENT_ACTION_SERVER_MONSTER_LOG\020" +
      ";\022.\n*ABILITY_INVOKE_ARGUMENT_ACTION_CREA" +
      "TE_TILE\020<\022/\n+ABILITY_INVOKE_ARGUMENT_ACT" +
      "ION_DESTROY_TILE\020=\0223\n/ABILITY_INVOKE_ARG" +
      "UMENT_ACTION_FIRE_AFTER_IMAGE\020>\0221\n-ABILI" +
      "TY_INVOKE_ARGUMENT_ACTION_DEDUCT_STAMINA" +
      "\020?\022-\n)ABILITY_INVOKE_ARGUMENT_ACTION_HIT" +
      "_EFFECT\020@\022:\n6ABILITY_INVOKE_ARGUMENT_ACT" +
      "ION_SET_BULLET_TRACK_TARGET\020A\0222\n.ABILITY" +
      "_INVOKE_ARGUMENT_ACTION_FIREWORK_EFFECT\020" +
      "B\0227\n3ABILITY_INVOKE_ARGUMENT_ACTION_LEVE" +
      "L_BANK_ADD_STUFF\020C\0228\n4ABILITY_INVOKE_ARG" +
      "UMENT_MIXIN_AVATAR_STEER_BY_CAMERA\020d\0220\n," +
      "ABILITY_INVOKE_ARGUMENT_MIXIN_MONSTER_DE" +
      "FEND\020e\022+\n\'ABILITY_INVOKE_ARGUMENT_MIXIN_" +
      "WIND_ZONE\020f\022.\n*ABILITY_INVOKE_ARGUMENT_M" +
      "IXIN_COST_STAMINA\020g\022.\n*ABILITY_INVOKE_AR" +
      "GUMENT_MIXIN_ELITE_SHIELD\020h\0220\n,ABILITY_I" +
      "NVOKE_ARGUMENT_MIXIN_ELEMENT_SHIELD\020i\022/\n" +
      "+ABILITY_INVOKE_ARGUMENT_MIXIN_GLOBAL_SH" +
      "IELD\020j\022,\n(ABILITY_INVOKE_ARGUMENT_MIXIN_" +
      "SHIELD_BAR\020k\0223\n/ABILITY_INVOKE_ARGUMENT_" +
      "MIXIN_WIND_SEED_SPAWNER\020l\022?\n;ABILITY_INV" +
      "OKE_ARGUMENT_MIXIN_DO_ACTION_BY_ELEMENT_" +
      "REACTION\020m\022;\n7ABILITY_INVOKE_ARGUMENT_MI" +
      "XIN_FIELD_ENTITY_COUNT_CHANGE\020n\0221\n-ABILI" +
      "TY_INVOKE_ARGUMENT_MIXIN_SCENE_PROP_SYNC" +
      "\020o\0223\n/ABILITY_INVOKE_ARGUMENT_MIXIN_WIDG" +
      "ET_MP_SUPPORT\020p\022U\nQABILITY_INVOKE_ARGUME" +
      "NT_MIXIN_DO_ACTION_BY_SELF_MODIFIER_ELEM" +
      "ENT_DURABILITY_RATIO\020q\0224\n0ABILITY_INVOKE" +
      "_ARGUMENT_MIXIN_FIREWORKS_LAUNCHER\020r\022<\n8" +
      "ABILITY_INVOKE_ARGUMENT_MIXIN_ATTACK_RES" +
      "ULT_CREATE_COUNT\020s\0222\n.ABILITY_INVOKE_ARG" +
      "UMENT_MIXIN_UGC_TIME_CONTROL\020t\022/\n+ABILIT" +
      "Y_INVOKE_ARGUMENT_MIXIN_AVATAR_COMBAT\020u\022" +
      "@\n<ABILITY_INVOKE_ARGUMENT_MIXIN_DEATH_Z" +
      "ONE_REGIONAL_PLAY_MIXIN\020v\022-\n)ABILITY_INV" +
      "OKE_ARGUMENT_MIXIN_UI_INTERACT\020w\0223\n/ABIL" +
      "ITY_INVOKE_ARGUMENT_MIXIN_SHOOT_FROM_CAM" +
      "ERA\020x\0226\n2ABILITY_INVOKE_ARGUMENT_MIXIN_E" +
      "RASE_BRICK_ACTIVITY\020y\022*\n&ABILITY_INVOKE_" +
      "ARGUMENT_MIXIN_BREAKOUT\020z\022-\n)ABILITY_INV" +
      "OKE_ARGUMENT_MIXIN_DAMAGE_LOAN\020{\022.\n*ABIL" +
      "ITY_INVOKE_ARGUMENT_MIXIN_BROADCAST_GV\020|" +
      "\022,\n(ABILITY_INVOKE_ARGUMENT_MIXIN_RECEIV" +
      "E_GV\020}\0227\n3ABILITY_INVOKE_ARGUMENT_MIXIN_" +
      "RAYCAST_SELECT_TARGET\020~\0227\n3ABILITY_INVOK" +
      "E_ARGUMENT_MIXIN_ENERGY_CRYSTAL_TARGET\020\177" +
      "\0229\n4ABILITY_INVOKE_ARGUMENT_MIXIN_ROTATI" +
      "ON_FOLLOW_CAMERA\020\200\001\0220\n+ABILITY_INVOKE_AR" +
      "GUMENT_MIXIN_BUOYANT_FORCE\020\201\001B\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
