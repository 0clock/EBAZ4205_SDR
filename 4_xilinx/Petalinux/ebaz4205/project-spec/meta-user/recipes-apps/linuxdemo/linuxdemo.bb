#
# This file is the linuxdemo recipe.
#

SUMMARY = "Simple linuxdemo application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://linuxdemo.c \
	   file://Makefile \
	   file://src/ \
		  "

S = "${WORKDIR}"

do_compile() {
	     oe_runmake
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 linuxdemo ${D}${bindir}
}
