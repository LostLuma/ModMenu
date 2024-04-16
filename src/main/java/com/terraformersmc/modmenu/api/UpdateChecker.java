package com.terraformersmc.modmenu.api;

public interface UpdateChecker {
	/**
	 * Gets called when ModMenu is checking for updates.
	 * This is done in a separate thread, so this call can/should be blocking.
	 *
	 * Your update checker should aim to return an update on the same or a more stable channel than requested.
	 *
	 * @param updateChannel The end user's preferred update channel.
	 * @return The update info
	 */
	UpdateInfo checkForUpdates(UpdateChannel updateChannel);
}
