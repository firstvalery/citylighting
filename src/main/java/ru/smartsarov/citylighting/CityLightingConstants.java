package ru.smartsarov.citylighting;

public class CityLightingConstants {
	/**
	 * Turn on evening mode constant
	 */
	static final int CMD_EVENING = 4;
	
	/**
	 * Turn on night mode constant
	 */
	static final int CMD_NIGHT = 1;
	
	/**
	 * Turn on night mode constant
	 */
	static final int CMD_MORNING = 2;
	
	/**
	 * Turn off all constant
	 */
	static final int CMD_OFF = 3;
		
	/**
	 * Color Off
	 */
	static final String YELLOW = "#FFFF00";
	/**
	 * Color one relay
	 */
	static final String GREEN = "#008000";	
	/**
	 * Color two relays 
	 */
	static final String LIME = "#00FF00";
	/**
	 * Color no link 
	 */
	static final String GRAY = "#808080";
	
	/**
	 * Command reset lock 
	 */
	static final String CMD_UNLOCK = "Команда снять блокировку отправлена устройству ";
	
	/**
	 * Command set standalone lock 
	 */
	static final String CMD_STANDALONE_LOCK = "Команда установить блокировку расписания отправлена устройству ";
	
	/**
	 * Command set all lock 
	 */
	static final String CMD_ALL_LOCK = "Команда установить полную блокировку отправлена устройству ";
	
	/**
	 * Command ignored
	 */
	static final String CMD_IGNORE = "Команда игнорирована. Устройство: ";
	
	/**
	 * Command ignored
	 */
	static final String CMD_EVENING_SET = "Принята команда установить ВЕЧЕРНИЙ РЕЖИМ. Устройство: ";
	
	/**
	 * Command ignored
	 */
	static final String CMD_NIGHT_SET = "Принята команда установить НОЧНОЙ РЕЖИМ. Устройство: ";
	
	/**
	 * Command ignored
	 */
	static final String CMD_MORNING_SET = "Принята команда установить УТРЕННИЙ РЕЖИМ. Устройство: ";
	
	/**
	 * Command ignored
	 */
	static final String CMD_OFF_SET = "Принята команда ОТКЛЮЧИТЬ ВСЁ. Устройство: ";
	
	
}
