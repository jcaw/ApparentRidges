// C usage example
// Non-boilerplate code starts from line 100

#define HLC_BOOT
#include <hlc.h>
void fun$init(void);

#include <hlc_main.c>

#ifndef HL_MAKE
#  include <hl/hashes.c>
#  include <hl/functions.c>
#  include <hl/BaseType.c>
#  include <_std/String.c>
#  include <_std/Date.c>
#  include <_std/Std.c>
#  include <_std/Math.c>
#  include <hl/types/ArrayAccess.c>
#  include <hl/types/ArrayBase.c>
#  include <hl/types/ArrayBytes_Int.c>
#  include <hl/types/ArrayBytes_hl_UI16.c>
#  include <hl/types/ArrayBytes_hl_F32.c>
#  include <hl/types/ArrayBytes_Float.c>
#  include <_std/StringBuf.c>
#  include <_std/SysError.c>
#  include <_std/Sys.c>
#  include <apparentridges/Ridge.c>
#  include <apparentridges/BSphere.c>
#  include <apparentridges/BBox.c>
#  include <apparentridges/BVHNode.c>
#  include <apparentridges/BVHTree.c>
#  include <apparentridges/Mesh.c>
#  include <haxe/Log.c>
#  include <hl/types/ArrayDyn.c>
#  include <apparentridges/RayHit.c>
#  include <apparentridges/Ray.c>
#  include <apparentridges/BVHPartition.c>
#  include <apparentridges/BVHBucket.c>
#  include <apparentridges/Line.c>
#  include <apparentridges/Render.c>
#  include <haxe/Exception.c>
#  include <haxe/ValueException.c>
#  include <hl/types/ArrayObj.c>
#  include <haxe/io/Bytes.c>
#  include <haxe/io/BytesDataImpl.c>
#  include <haxe/io/Eof.c>
#  include <haxe/io/Output.c>
#  include <haxe/iterators/ArrayIterator.c>
#  include <haxe/iterators/ArrayKeyValueIterator.c>
#  include <hl/NativeArrayIterator_Dynamic.c>
#  include <hl/NativeArrayIterator_Int.c>
#  include <hl/types/BytesIterator_Float.c>
#  include <hl/types/BytesKeyValueIterator_Float.c>
#  include <hl/types/BytesIterator_Int.c>
#  include <hl/types/BytesKeyValueIterator_Int.c>
#  include <hl/types/BytesIterator_hl_F32.c>
#  include <hl/types/BytesKeyValueIterator_hl_F32.c>
#  include <hl/types/BytesIterator_hl_UI16.c>
#  include <hl/types/BytesKeyValueIterator_hl_UI16.c>
#  include <hl/types/ArrayDynIterator.c>
#  include <hl/types/ArrayDynKeyValueIterator.c>
#  include <hl/types/ArrayObjIterator.c>
#  include <hl/types/ArrayObjKeyValueIterator.c>
#  include <sys/io/FileOutput.c>
#  include <_std/StringTools.c>
#  include <hl/_Bytes/Bytes_Impl_.c>
#  include <_std/Type.c>
#  include <apparentridges/Util.c>
#  include <apparentridges/_ApparentRidges/Vec3_Impl_.c>
#  include <apparentridges/_ApparentRidges/Face_Impl_.c>
#  include <apparentridges/OBJParser.c>
#  include <apparentridges/_ApparentRidges/Polyline_Impl_.c>
#  include <apparentridges/PixelMap.c>
#  include <apparentridges/SVGWriter.c>
#  include <haxe/NativeStackTrace.c>
#  include <haxe/ds/ArraySort.c>
#  include <sys/io/File.c>
#  include <hl/init.c>
#  include <hl/reflect.c>
#  include <hl/types.c>
#  include <hl/globals.c>
#endif

void hl_init_hashes();
void hl_init_roots();
void hl_init_types( hl_module_context *ctx );
extern void *hl_functions_ptrs[];
extern hl_type *hl_functions_types[];

// Entry point
void hl_entry_point() {
	hl_module_context ctx;
	hl_alloc_init(&ctx.alloc);
	ctx.functions_ptrs = hl_functions_ptrs;
	ctx.functions_types = hl_functions_types;
	hl_init_types(&ctx);
	hl_init_hashes();
	hl_init_roots();
	fun$init();

// Real code starts here
	static struct _String const_s$str = {&t$String,(vbyte*)USTR("../../testdata/lucy_100K.obj"),24};
  apparentridges__Mesh mesh = apparentridges_OBJParser_fromFile(&const_s$str);

  apparentridges__Render render = (apparentridges__Render)hl_alloc_obj(&t$apparentridges_Render);
  apparentridges_Render_new(render,mesh,800,800);
  apparentridges_Render_autoPlace(render,NULL,NULL);
  apparentridges_Render_apparentRidges(render,0.1,NULL);

  String out = apparentridges_SVGWriter_lines(render,NULL);

  static struct _String const_s$name = {&t$String,(vbyte*)USTR("out.svg"),7};
  sys_io_File_saveContent(&const_s$name,out);
}

