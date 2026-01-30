src=$(wildcard World_1/*.java)
CLASS = $(wildcard World_1/*.class)

all: exec

exec: 
	javac $(src)

run:
	java World_1.Main

doc:
	./documentation.sh

doc_clean:
	rm -rf doc

clean:
	rm $(CLASS)