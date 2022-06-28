# References:
#    https://stackoverflow.com/questions/51102780/compile-dlib-library-with-yocto
#    https://stackoverflow.com/questions/51205623/yocto-recipe-for-an-application-that-uses-dlib-and-opencv

SUMMARY = "A toolkit for making real world machine learning and data analysis applications"
HOMEPAGE = "https://github.com/davisking/dlib"

LICENSE = "Boost-Software"
LIC_FILES_CHKSUM = "file://dlib/LICENSE.txt;md5=2c7a3fa82e66676005cd4ee2608fd7d2 \
                    file://dlib/external/pybind11/LICENSE;md5=beb87117af69fd10fbf9fb14c22a2e62 \
                    file://dlib/external/libpng/LICENSE;md5=243135ddedf702158f9170807cbcfb66 \
                    file://docs/docs/license.xml;md5=2e6ff4080dcb217d4d300b90e9aabb5b \
                    file://examples/LICENSE_FOR_EXAMPLE_PROGRAMS.txt;md5=57eee82829ed297e23d84de5f905afee \
                    file://examples/video_frames/license.txt;md5=127ee508b60a6be9dea8af3b441993dc \
                    file://python_examples/LICENSE_FOR_EXAMPLE_PROGRAMS.txt;md5=064f53ab40ea2b6a4bba1324149e4fde"

SRC_URI = "git://github.com/davisking/dlib.git;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "3b794540baeabbcd033b544230401967106d5483"

S = "${WORKDIR}/git"

inherit cmake

#EXTRA_OECMAKE += "-DDLIB_NO_GUI_SUPPORT=ON -DBUILD_SHARED_LIBS=ON"

