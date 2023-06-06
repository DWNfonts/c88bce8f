SRCFILES := $(shell find src -name \*.java)
RESFILES := $(shell find src -type f \! -name .\* \! -name \*.java | sed s/^src\\///)
PACKAGES := $(shell find src -name \*.java | sed -E s/^src\\/\|\\/[^\\/]+$$//g | grep -v \\.java$$ | sort | uniq | tr / .)

all: clean bin c88bce8f.jar c88bce8f-src.tgz

eclipseall: eclipseclean c88bce8f.jar c88bce8f-src.tgz

clean:
	rm -rf bin
	rm -rf doc
	rm -rf c88bce8f*.jar
	rm -rf c88bce8f*.tgz

eclipseclean:
	rm -rf c88bce8f*.jar
	rm -rf c88bce8f*.tgz

bin: src
	mkdir -p bin
ifeq ($(origin JAVACFLAGS), undefined)
	$(eval JAVACFLAGS = $(shell dep/minJavaVerOpts))
endif
	javac $(JAVACFLAGS) -classpath dep/KSFL.jar:dep/ual.jar -sourcepath src $(SRCFILES) -d bin
	$(foreach res,$(RESFILES),cp src/$(res) bin/$(res);)

doc: src
	mkdir -p doc
	javadoc $(JAVADOCFLAGS) -classpath dep/KSFL.jar:dep/ual.jar -sourcepath src $(PACKAGES) -d doc

c88bce8f.jar: bin
	export COPYFILE_DISABLE=true
	find bin -name .DS_Store -delete
	jar cmf dep/MANIFEST.MF c88bce8f.jar -C bin com/kreative/unicode -C bin com/dwnfonts/c88bce8f
	chmod +x c88bce8f.jar

c88bce8f-src.tgz: src
	export COPYFILE_DISABLE=true
	find src -name .DS_Store -delete
	tar -czf c88bce8f-src.tgz LICENSE src/com/kreative/unicode src/com/dwnfonts/c88bce8f

install: dep c88bce8f.jar MapEdit.jar KeyEdit.jar
	sudo mkdir -p /usr/local/lib/
	sudo cp -f c88bce8f.jar /usr/local/lib/c88bce8f.jar
	sudo chmod -f 644 /usr/local/lib/c88bce8f.jar
	sudo mkdir -p /usr/local/bin/
	sudo cp -f dep/c88bce8f /usr/local/bin/c88bce8f
	sudo chmod -f 755 /usr/local/bin/c88bce8f
	sudo mkdir -p /usr/share/icons/hicolor/128x128/apps/
	sudo mkdir -p /usr/share/icons/hicolor/256x256/apps/
	sudo mkdir -p /usr/share/icons/hicolor/512x512/apps/
	sudo cp -f dep/c88bce8f.png /usr/share/icons/hicolor/128x128/apps/c88bce8f.png
	sudo cp -f dep/kbnp-icon.png /usr/share/icons/hicolor/512x512/apps/c88bce8f.png
	sudo chmod -f 644 /usr/share/icons/hicolor/128x128/apps/c88bce8f.png
	sudo chmod -f 644 /usr/share/icons/hicolor/512x512/apps/c88bce8f.png
	sudo mkdir -p /usr/share/applications/
	sudo cp -f dep/c88bce8f.desktop /usr/share/applications/c88bce8f.desktop
	sudo chmod -f 644 /usr/share/applications/c88bce8f.desktop

.PHONY: all eclipseall clean eclipseclean c88bce8f.app install
