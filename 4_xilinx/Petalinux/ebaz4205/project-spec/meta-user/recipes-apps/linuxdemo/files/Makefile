APP = linuxdemo

# Add any other object files to this list below

SRC_DIR = src
CPP_SOURCES = $(wildcard $(SRC_DIR)/*.cpp)

APP_OBJS = linuxdemo.o $(CPP_SOURCES:.cpp=.o)

all: build

build: $(APP)

$(APP): $(APP_OBJS)
	$(CXX) -o $@ $(APP_OBJS) $(LDFLAGS) $(LDLIBS)
clean:
	rm -f $(APP) *.o

