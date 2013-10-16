# DB/2 Tablespace Monitor

See http://uptimesoftware.github.io for more information.

### Tags 
 plugin   db2   database   deprecated  

### Category

database

### Version Compatibility


  
* DB2 Buffer Pool Monitor 1.0 - 6.0, 5.5, 5.4, 5.3, 5.2
  


### Description
Monitors tablespace for DB2 databases.
This monitor has been bundled into the DB2 Monitors plugin.
Note: It is not supported for QAS databases.


### Supported Monitoring Stations

6.0, 5.5, 5.4, 5.3, 5.2

### Supported Agents
None; no agent required

### Installation Notes
<ol>
<li>Place jar file(s) in "/core" directory</li>
</ol>


<p>If on Linux/Solaris:
- edit the /uptime.lax file and add the new jar files to the line that starts with:
lax.class.path=...</p>

<p>Note: It will be a single long line even though it looks like it's on multiple lines. Make sure the new jar filenames are on the same line.</p>

<ol>
<li><p>Restart the up.time Data Collector (core)</p></li>
<li><p>Place the xml file in the uptime directory and run the following command(s) from the uptime directory:</p>

<blockquote><p>scripts\erdcloader -x</p></blockquote></li>
</ol>



### Dependencies
<p>This monitor requires the "MonitorDB2.jar" file to be placed in it's directory (scripts/).</p>


### Input Variables


### Output Variables



### Languages Used

* Shell/Batch

* Java

