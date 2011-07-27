/* 
 * Copyright (C) 2010 Christian Schneider
 * 
 * This file is part of Simple Lightweight Cache Cleaner Widget. (SLW Cache Cleaner Widget)
 * 
 * Simple Lightweight Cache Cleaner Widget is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Simple Lightweight Cache Cleaner Widget is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Simple Lightweight Cache Cleaner Widget.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package tritop.android.SLWCacheCleanerWidget;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CacheCleanerReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent nIntent =new Intent(context,CacheCleanerService.class);
		nIntent.fillIn(intent, 0);
		context.startService(nIntent);
	}

}