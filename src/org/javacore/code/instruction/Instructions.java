package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 * @author Obicere
 */
public class Instructions {

    public static final int OPCODE_NOP             = 0x0;
    public static final int OPCODE_ACONST_NULL     = 0x1;
    public static final int OPCODE_ICONST_M1       = 0x2;
    public static final int OPCODE_ICONST_0        = 0x3;
    public static final int OPCODE_ICONST_1        = 0x4;
    public static final int OPCODE_ICONST_2        = 0x5;
    public static final int OPCODE_ICONST_3        = 0x6;
    public static final int OPCODE_ICONST_4        = 0x7;
    public static final int OPCODE_ICONST_5        = 0x8;
    public static final int OPCODE_LCONST_0        = 0x9;
    public static final int OPCODE_LCONST_1        = 0xa;
    public static final int OPCODE_FCONST_0        = 0xb;
    public static final int OPCODE_FCONST_1        = 0xc;
    public static final int OPCODE_FCONST_2        = 0xd;
    public static final int OPCODE_DCONST_0        = 0xe;
    public static final int OPCODE_DCONST_1        = 0xf;
    public static final int OPCODE_BIPUSH          = 0x10;
    public static final int OPCODE_SIPUSH          = 0x11;
    public static final int OPCODE_LDC             = 0x12;
    public static final int OPCODE_LDC_W           = 0x13;
    public static final int OPCODE_LDC2_W          = 0x14;
    public static final int OPCODE_ILOAD           = 0x15;
    public static final int OPCODE_LLOAD           = 0x16;
    public static final int OPCODE_FLOAD           = 0x17;
    public static final int OPCODE_DLOAD           = 0x18;
    public static final int OPCODE_ALOAD           = 0x19;
    public static final int OPCODE_ILOAD_0         = 0x1a;
    public static final int OPCODE_ILOAD_1         = 0x1b;
    public static final int OPCODE_ILOAD_2         = 0x1c;
    public static final int OPCODE_ILOAD_3         = 0x1d;
    public static final int OPCODE_LLOAD_0         = 0x1e;
    public static final int OPCODE_LLOAD_1         = 0x1f;
    public static final int OPCODE_LLOAD_2         = 0x20;
    public static final int OPCODE_LLOAD_3         = 0x21;
    public static final int OPCODE_FLOAD_0         = 0x22;
    public static final int OPCODE_FLOAD_1         = 0x23;
    public static final int OPCODE_FLOAD_2         = 0x24;
    public static final int OPCODE_FLOAD_3         = 0x25;
    public static final int OPCODE_DLOAD_0         = 0x26;
    public static final int OPCODE_DLOAD_1         = 0x27;
    public static final int OPCODE_DLOAD_2         = 0x28;
    public static final int OPCODE_DLOAD_3         = 0x29;
    public static final int OPCODE_ALOAD_0         = 0x2a;
    public static final int OPCODE_ALOAD_1         = 0x2b;
    public static final int OPCODE_ALOAD_2         = 0x2c;
    public static final int OPCODE_ALOAD_3         = 0x2d;
    public static final int OPCODE_IALOAD          = 0x2e;
    public static final int OPCODE_LALOAD          = 0x2f;
    public static final int OPCODE_FALOAD          = 0x30;
    public static final int OPCODE_DALOAD          = 0x31;
    public static final int OPCODE_AALOAD          = 0x32;
    public static final int OPCODE_BALOAD          = 0x33;
    public static final int OPCODE_CALOAD          = 0x34;
    public static final int OPCODE_SALOAD          = 0x35;
    public static final int OPCODE_ISTORE          = 0x36;
    public static final int OPCODE_LSTORE          = 0x37;
    public static final int OPCODE_FSTORE          = 0x38;
    public static final int OPCODE_DSTORE          = 0x39;
    public static final int OPCODE_ASTORE          = 0x3a;
    public static final int OPCODE_ISTORE_0        = 0x3b;
    public static final int OPCODE_ISTORE_1        = 0x3c;
    public static final int OPCODE_ISTORE_2        = 0x3d;
    public static final int OPCODE_ISTORE_3        = 0x3e;
    public static final int OPCODE_LSTORE_0        = 0x3f;
    public static final int OPCODE_LSTORE_1        = 0x40;
    public static final int OPCODE_LSTORE_2        = 0x41;
    public static final int OPCODE_LSTORE_3        = 0x42;
    public static final int OPCODE_FSTORE_0        = 0x43;
    public static final int OPCODE_FSTORE_1        = 0x44;
    public static final int OPCODE_FSTORE_2        = 0x45;
    public static final int OPCODE_FSTORE_3        = 0x46;
    public static final int OPCODE_DSTORE_0        = 0x47;
    public static final int OPCODE_DSTORE_1        = 0x48;
    public static final int OPCODE_DSTORE_2        = 0x49;
    public static final int OPCODE_DSTORE_3        = 0x4a;
    public static final int OPCODE_ASTORE_0        = 0x4b;
    public static final int OPCODE_ASTORE_1        = 0x4c;
    public static final int OPCODE_ASTORE_2        = 0x4d;
    public static final int OPCODE_ASTORE_3        = 0x4e;
    public static final int OPCODE_IASTORE         = 0x4f;
    public static final int OPCODE_LASTORE         = 0x50;
    public static final int OPCODE_FASTORE         = 0x51;
    public static final int OPCODE_DASTORE         = 0x52;
    public static final int OPCODE_AASTORE         = 0x53;
    public static final int OPCODE_BASTORE         = 0x54;
    public static final int OPCODE_CASTORE         = 0x55;
    public static final int OPCODE_SASTORE         = 0x56;
    public static final int OPCODE_POP             = 0x57;
    public static final int OPCODE_POP2            = 0x58;
    public static final int OPCODE_DUP             = 0x59;
    public static final int OPCODE_DUP_X1          = 0x5a;
    public static final int OPCODE_DUP_X2          = 0x5b;
    public static final int OPCODE_DUP2            = 0x5c;
    public static final int OPCODE_DUP2_X1         = 0x5d;
    public static final int OPCODE_DUP2_X2         = 0x5e;
    public static final int OPCODE_SWAP            = 0x5f;
    public static final int OPCODE_IADD            = 0x60;
    public static final int OPCODE_LADD            = 0x61;
    public static final int OPCODE_FADD            = 0x62;
    public static final int OPCODE_DADD            = 0x63;
    public static final int OPCODE_ISUB            = 0x64;
    public static final int OPCODE_LSUB            = 0x65;
    public static final int OPCODE_FSUB            = 0x66;
    public static final int OPCODE_DSUB            = 0x67;
    public static final int OPCODE_IMUL            = 0x68;
    public static final int OPCODE_LMUL            = 0x69;
    public static final int OPCODE_FMUL            = 0x6a;
    public static final int OPCODE_DMUL            = 0x6b;
    public static final int OPCODE_IDIV            = 0x6c;
    public static final int OPCODE_LDIV            = 0x6d;
    public static final int OPCODE_FDIV            = 0x6e;
    public static final int OPCODE_DDIV            = 0x6f;
    public static final int OPCODE_IREM            = 0x70;
    public static final int OPCODE_LREM            = 0x71;
    public static final int OPCODE_FREM            = 0x72;
    public static final int OPCODE_DREM            = 0x73;
    public static final int OPCODE_INEG            = 0x74;
    public static final int OPCODE_LNEG            = 0x75;
    public static final int OPCODE_FNEG            = 0x76;
    public static final int OPCODE_DNEG            = 0x77;
    public static final int OPCODE_ISHL            = 0x78;
    public static final int OPCODE_LSHL            = 0x79;
    public static final int OPCODE_ISHR            = 0x7a;
    public static final int OPCODE_LSHR            = 0x7b;
    public static final int OPCODE_IUSHR           = 0x7c;
    public static final int OPCODE_LUSHR           = 0x7d;
    public static final int OPCODE_IAND            = 0x7e;
    public static final int OPCODE_LAND            = 0x7f;
    public static final int OPCODE_IOR             = 0x80;
    public static final int OPCODE_LOR             = 0x81;
    public static final int OPCODE_IXOR            = 0x82;
    public static final int OPCODE_LXOR            = 0x83;
    public static final int OPCODE_IINC            = 0x84;
    public static final int OPCODE_I2L             = 0x85;
    public static final int OPCODE_I2F             = 0x86;
    public static final int OPCODE_I2D             = 0x87;
    public static final int OPCODE_L2I             = 0x88;
    public static final int OPCODE_L2F             = 0x89;
    public static final int OPCODE_L2D             = 0x8a;
    public static final int OPCODE_F2I             = 0x8b;
    public static final int OPCODE_F2L             = 0x8c;
    public static final int OPCODE_F2D             = 0x8d;
    public static final int OPCODE_D2I             = 0x8e;
    public static final int OPCODE_D2L             = 0x8f;
    public static final int OPCODE_D2F             = 0x90;
    public static final int OPCODE_I2B             = 0x91;
    public static final int OPCODE_I2C             = 0x92;
    public static final int OPCODE_I2S             = 0x93;
    public static final int OPCODE_LCMP            = 0x94;
    public static final int OPCODE_FCMPL           = 0x95;
    public static final int OPCODE_FCMPG           = 0x96;
    public static final int OPCODE_DCMPL           = 0x97;
    public static final int OPCODE_DCMPG           = 0x98;
    public static final int OPCODE_IFEQ            = 0x99;
    public static final int OPCODE_IFNE            = 0x9a;
    public static final int OPCODE_IFLT            = 0x9b;
    public static final int OPCODE_IFGE            = 0x9c;
    public static final int OPCODE_IFGT            = 0x9d;
    public static final int OPCODE_IFLE            = 0x9e;
    public static final int OPCODE_IF_ICMPEQ       = 0x9f;
    public static final int OPCODE_IF_ICMPNE       = 0xa0;
    public static final int OPCODE_IF_ICMPLT       = 0xa1;
    public static final int OPCODE_IF_ICMPGE       = 0xa2;
    public static final int OPCODE_IF_ICMPGT       = 0xa3;
    public static final int OPCODE_IF_ICMPLE       = 0xa4;
    public static final int OPCODE_IF_ACMPEQ       = 0xa5;
    public static final int OPCODE_IF_ACMPNE       = 0xa6;
    public static final int OPCODE_GOTO            = 0xa7;
    public static final int OPCODE_JSR             = 0xa8;
    public static final int OPCODE_RET             = 0xa9;
    public static final int OPCODE_TABLESWITCH     = 0xaa;
    public static final int OPCODE_LOOKUPSWITCH    = 0xab;
    public static final int OPCODE_IRETURN         = 0xac;
    public static final int OPCODE_LRETURN         = 0xad;
    public static final int OPCODE_FRETURN         = 0xae;
    public static final int OPCODE_DRETURN         = 0xaf;
    public static final int OPCODE_ARETURN         = 0xb0;
    public static final int OPCODE_RETURN          = 0xb1;
    public static final int OPCODE_GETSTATIC       = 0xb2;
    public static final int OPCODE_PUTSTATIC       = 0xb3;
    public static final int OPCODE_GETFIELD        = 0xb4;
    public static final int OPCODE_PUTFIELD        = 0xb5;
    public static final int OPCODE_INVOKEVIRTUAL   = 0xb6;
    public static final int OPCODE_INVOKESPECIAL   = 0xb7;
    public static final int OPCODE_INVOKESTATIC    = 0xb8;
    public static final int OPCODE_INVOKEINTERFACE = 0xb9;
    public static final int OPCODE_INVOKEDYNAMIC   = 0xba;
    public static final int OPCODE_NEW             = 0xbb;
    public static final int OPCODE_NEWARRAY        = 0xbc;
    public static final int OPCODE_ANEWARRAY       = 0xbd;
    public static final int OPCODE_ARRAYLENGTH     = 0xbe;
    public static final int OPCODE_ATHROW          = 0xbf;
    public static final int OPCODE_CHECKCAST       = 0xc0;
    public static final int OPCODE_INSTANCEOF      = 0xc1;
    public static final int OPCODE_MONITORENTER    = 0xc2;
    public static final int OPCODE_MONITOREXIT     = 0xc3;
    public static final int OPCODE_WIDE            = 0xc4;
    public static final int OPCODE_MULTIANEWARRAY  = 0xc5;
    public static final int OPCODE_IFNULL          = 0xc6;
    public static final int OPCODE_IFNONNULL       = 0xc7;
    public static final int OPCODE_GOTO_W          = 0xc8;
    public static final int OPCODE_JSR_W           = 0xc9;
    public static final int OPCODE_BREAKPOINT      = 0xca;
    public static final int OPCODE_IMPDEP1         = 0xfe;
    public static final int OPCODE_IMPDEP2         = 0xff;

    private static final String[] S_NAME = new String[]{
            "nop", "aconst_null", "iconst_m1", "iconst_0", "iconst_1",
            "iconst_2", "iconst_3", "iconst_4", "iconst_5", "lconst_0",
            "lconst_1", "fconst_0", "fconst_1", "fconst_2", "dconst_0",
            "dconst_1", "bipush", "sipush", "ldc", "ldc_w", "ldc2_w",
            "iload", "lload", "fload", "dload", "aload", "iload_0",
            "iload_1", "iload_2", "iload_3", "lload_0", "lload_1",
            "lload_2", "lload_3", "fload_0", "fload_1", "fload_2",
            "fload_3", "dload_0", "dload_1", "dload_2", "dload_3",
            "aload_0", "aload_1", "aload_2", "aload_3", "iaload", "laload",
            "faload", "daload", "aaload", "baload", "caload", "saload",
            "istore", "lstore", "fstore", "dstore", "astore", "istore_0",
            "istore_1", "istore_2", "istore_3", "lstore_0", "lstore_1",
            "lstore_2", "lstore_3", "fstore_0", "fstore_1", "fstore_2",
            "fstore_3", "dstore_0", "dstore_1", "dstore_2", "dstore_3",
            "astore_0", "astore_1", "astore_2", "astore_3", "iastore",
            "lastore", "fastore", "dastore", "aastore", "bastore",
            "castore", "sastore", "pop", "pop2", "dup", "dup_x1", "dup_x2",
            "dup2", "dup2_x1", "dup2_x2", "swap", "iadd", "ladd", "fadd",
            "dadd", "isub", "lsub", "fsub", "dsub", "imul", "lmul", "fmul",
            "dmul", "idiv", "ldiv", "fdiv", "ddiv", "irem", "lrem", "frem",
            "drem", "ineg", "lneg", "fneg", "dneg", "ishl", "lshl", "ishr",
            "lshr", "iushr", "lushr", "iand", "land", "ior", "lor", "ixor",
            "lxor", "iinc", "i2l", "i2f", "i2d", "l2i", "l2f", "l2d",
            "f2i", "f2l", "f2d", "d2i", "d2l", "d2f", "i2b", "i2c", "i2s",
            "lcmp", "fcmpl", "fcmpg", "dcmpl", "dcmpg", "ifeq", "ifne",
            "iflt", "ifge", "ifgt", "ifle", "if_icmpeq", "if_icmpne",
            "if_icmplt", "if_icmpge", "if_icmpgt", "if_icmple",
            "if_acmpeq", "if_acmpne", "goto", "jsr", "ret", "tableswitch",
            "lookupswitch", "ireturn", "lreturn", "freturn", "dreturn",
            "areturn", "return", "getstatic", "putstatic", "getfield",
            "putfield", "invokevirtual", "invokespecial", "invokestatic",
            "invokeinterface", "invokedynamic", "new", "newarray",
            "anewarray", "arraylength", "athrow", "checkcast",
            "instanceof", "monitorenter", "monitorexit", "wide",
            "multianewarray", "ifnull", "ifnonnull", "goto_w", "jsr_w",
            "breakpoint", //breakpoint
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, "impdep1", //impdep1
            "impdep2", //impdep2
    };

    private static final Identifier[] I_NAME = new Identifier[]{
            Identifier.NOP, Identifier.ACONST_NULL, Identifier.ICONST_M1,
            Identifier.ICONST_0, Identifier.ICONST_1, Identifier.ICONST_2,
            Identifier.ICONST_3, Identifier.ICONST_4, Identifier.ICONST_5,
            Identifier.LCONST_0, Identifier.LCONST_1, Identifier.FCONST_0,
            Identifier.FCONST_1, Identifier.FCONST_2, Identifier.DCONST_0,
            Identifier.DCONST_1, Identifier.BIPUSH, Identifier.SIPUSH,
            Identifier.LDC, Identifier.LDC_W, Identifier.LDC2_W,
            Identifier.ILOAD, Identifier.LLOAD, Identifier.FLOAD,
            Identifier.DLOAD, Identifier.ALOAD, Identifier.ILOAD_0,
            Identifier.ILOAD_1, Identifier.ILOAD_2, Identifier.ILOAD_3,
            Identifier.LLOAD_0, Identifier.LLOAD_1, Identifier.LLOAD_2,
            Identifier.LLOAD_3, Identifier.FLOAD_0, Identifier.FLOAD_1,
            Identifier.FLOAD_2, Identifier.FLOAD_3, Identifier.DLOAD_0,
            Identifier.DLOAD_1, Identifier.DLOAD_2, Identifier.DLOAD_3,
            Identifier.ALOAD_0, Identifier.ALOAD_1, Identifier.ALOAD_2,
            Identifier.ALOAD_3, Identifier.IALOAD, Identifier.LALOAD,
            Identifier.FALOAD, Identifier.DALOAD, Identifier.AALOAD,
            Identifier.BALOAD, Identifier.CALOAD, Identifier.SALOAD,
            Identifier.ISTORE, Identifier.LSTORE, Identifier.FSTORE,
            Identifier.DSTORE, Identifier.ASTORE, Identifier.ISTORE_0,
            Identifier.ISTORE_1, Identifier.ISTORE_2, Identifier.ISTORE_3,
            Identifier.LSTORE_0, Identifier.LSTORE_1, Identifier.LSTORE_2,
            Identifier.LSTORE_3, Identifier.FSTORE_0, Identifier.FSTORE_1,
            Identifier.FSTORE_2, Identifier.FSTORE_3, Identifier.DSTORE_0,
            Identifier.DSTORE_1, Identifier.DSTORE_2, Identifier.DSTORE_3,
            Identifier.ASTORE_0, Identifier.ASTORE_1, Identifier.ASTORE_2,
            Identifier.ASTORE_3, Identifier.IASTORE, Identifier.LASTORE,
            Identifier.FASTORE, Identifier.DASTORE, Identifier.AASTORE,
            Identifier.BASTORE, Identifier.CASTORE, Identifier.SASTORE,
            Identifier.POP, Identifier.POP2, Identifier.DUP,
            Identifier.DUP_X1, Identifier.DUP_X2, Identifier.DUP2,
            Identifier.DUP2_X1, Identifier.DUP2_X2, Identifier.SWAP,
            Identifier.IADD, Identifier.LADD, Identifier.FADD,
            Identifier.DADD, Identifier.ISUB, Identifier.LSUB,
            Identifier.FSUB, Identifier.DSUB, Identifier.IMUL,
            Identifier.LMUL, Identifier.FMUL, Identifier.DMUL,
            Identifier.IDIV, Identifier.LDIV, Identifier.FDIV,
            Identifier.DDIV, Identifier.IREM, Identifier.LREM,
            Identifier.FREM, Identifier.DREM, Identifier.INEG,
            Identifier.LNEG, Identifier.FNEG, Identifier.DNEG,
            Identifier.ISHL, Identifier.LSHL, Identifier.ISHR,
            Identifier.LSHR, Identifier.IUSHR, Identifier.LUSHR,
            Identifier.IAND, Identifier.LAND, Identifier.IOR,
            Identifier.LOR, Identifier.IXOR, Identifier.LXOR,
            Identifier.IINC, Identifier.I2L, Identifier.I2F,
            Identifier.I2D, Identifier.L2I, Identifier.L2F, Identifier.L2D,
            Identifier.F2I, Identifier.F2L, Identifier.F2D, Identifier.D2I,
            Identifier.D2L, Identifier.D2F, Identifier.I2B, Identifier.I2C,
            Identifier.I2S, Identifier.LCMP, Identifier.FCMPL,
            Identifier.FCMPG, Identifier.DCMPL, Identifier.DCMPG,
            Identifier.IFEQ, Identifier.IFNE, Identifier.IFLT,
            Identifier.IFGE, Identifier.IFGT, Identifier.IFLE,
            Identifier.IF_ICMPEQ, Identifier.IF_ICMPNE,
            Identifier.IF_ICMPLT, Identifier.IF_ICMPGE,
            Identifier.IF_ICMPGT, Identifier.IF_ICMPLE,
            Identifier.IF_ACMPEQ, Identifier.IF_ACMPNE, Identifier.GOTO,
            Identifier.JSR, Identifier.RET, Identifier.TABLESWITCH,
            Identifier.LOOKUPSWITCH, Identifier.IRETURN,
            Identifier.LRETURN, Identifier.FRETURN, Identifier.DRETURN,
            Identifier.ARETURN, Identifier.RETURN, Identifier.GETSTATIC,
            Identifier.PUTSTATIC, Identifier.GETFIELD, Identifier.PUTFIELD,
            Identifier.INVOKEVIRTUAL, Identifier.INVOKESPECIAL,
            Identifier.INVOKESTATIC, Identifier.INVOKEINTERFACE,
            Identifier.INVOKEDYNAMIC, Identifier.NEW, Identifier.NEWARRAY,
            Identifier.ANEWARRAY, Identifier.ARRAYLENGTH,
            Identifier.ATHROW, Identifier.CHECKCAST, Identifier.INSTANCEOF,
            Identifier.MONITORENTER, Identifier.MONITOREXIT,
            Identifier.WIDE, Identifier.MULTIANEWARRAY, Identifier.IFNULL,
            Identifier.IFNONNULL, Identifier.GOTO_W, Identifier.JSR_W,
            Identifier.BREAKPOINT, //Identifier.BREAKPOINT
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, Identifier.IMPDEP1, //Identifier.IMPDEP1
            Identifier.IMPDEP2, //Identifier.IMPDEP2
    };

    public static int opcode(final Identifier identifier) {
        if (identifier == null) {
            return -1;
        }
        return getOpcode(identifier.name());
    }

    public static int opcode(final String name) {
        if (name == null) {
            return -1;
        }
        return getOpcode(name);
    }

    public static Identifier of(final int opcode) {
        checkOpcode(opcode);
        return I_NAME[opcode];
    }

    public static Identifier of(final String name) {
        if (name == null) {
            return null;
        }
        return I_NAME[opcode(name)];
    }

    public static String name(final int opcode) {
        checkOpcode(opcode);
        return S_NAME[opcode];
    }

    public static String name(final Identifier identifier) {
        if (identifier == null) {
            return null;
        }
        return S_NAME[opcode(identifier)];
    }

    private static void checkOpcode(final int opcode) {
        if (opcode < 0 || opcode >= 256) {
            throw new IllegalArgumentException("opcode must be within [0, 255]");
        }
    }

    /**
     * Unfortunately, after quite a bit of testing, no perfect hashing
     * algorithm was conceived. This is mostly due to so many instructions
     * having near-identical mnemonics. For example, <code>if_acmpge</code>
     * and <code>if_icmpge</code>. These sort of mnemonics defeat the
     * Cichelli's quite easily.
     *
     * @param name Name of the mnemonic. This is case insensitive.
     * @return The opcode for this mnemonic.
     */
    private static int getOpcode(final String name) {
        switch (name.toLowerCase()) {
            case "nop":
                return OPCODE_NOP;
            case "aconst_null":
                return OPCODE_ACONST_NULL;
            case "iconst_m1":
                return OPCODE_ICONST_M1;
            case "iconst_0":
                return OPCODE_ICONST_0;
            case "iconst_1":
                return OPCODE_ICONST_1;
            case "iconst_2":
                return OPCODE_ICONST_2;
            case "iconst_3":
                return OPCODE_ICONST_3;
            case "iconst_4":
                return OPCODE_ICONST_4;
            case "iconst_5":
                return OPCODE_ICONST_5;
            case "lconst_0":
                return OPCODE_LCONST_0;
            case "lconst_1":
                return OPCODE_LCONST_1;
            case "fconst_0":
                return OPCODE_FCONST_0;
            case "fconst_1":
                return OPCODE_FCONST_1;
            case "fconst_2":
                return OPCODE_FCONST_2;
            case "dconst_0":
                return OPCODE_DCONST_0;
            case "dconst_1":
                return OPCODE_DCONST_1;
            case "bipush":
                return OPCODE_BIPUSH;
            case "sipush":
                return OPCODE_SIPUSH;
            case "ldc":
                return OPCODE_LDC;
            case "ldc_w":
                return OPCODE_LDC_W;
            case "ldc2_w":
                return OPCODE_LDC2_W;
            case "iload":
                return OPCODE_ILOAD;
            case "lload":
                return OPCODE_LLOAD;
            case "fload":
                return OPCODE_FLOAD;
            case "dload":
                return OPCODE_DLOAD;
            case "aload":
                return OPCODE_ALOAD;
            case "iload_0":
                return OPCODE_ILOAD_0;
            case "iload_1":
                return OPCODE_ILOAD_1;
            case "iload_2":
                return OPCODE_ILOAD_2;
            case "iload_3":
                return OPCODE_ILOAD_3;
            case "lload_0":
                return OPCODE_LLOAD_0;
            case "lload_1":
                return OPCODE_LLOAD_1;
            case "lload_2":
                return OPCODE_LLOAD_2;
            case "lload_3":
                return OPCODE_LLOAD_3;
            case "fload_0":
                return OPCODE_FLOAD_0;
            case "fload_1":
                return OPCODE_FLOAD_1;
            case "fload_2":
                return OPCODE_FLOAD_2;
            case "fload_3":
                return OPCODE_FLOAD_3;
            case "dload_0":
                return OPCODE_DLOAD_0;
            case "dload_1":
                return OPCODE_DLOAD_1;
            case "dload_2":
                return OPCODE_DLOAD_2;
            case "dload_3":
                return OPCODE_DLOAD_3;
            case "aload_0":
                return OPCODE_ALOAD_0;
            case "aload_1":
                return OPCODE_ALOAD_1;
            case "aload_2":
                return OPCODE_ALOAD_2;
            case "aload_3":
                return OPCODE_ALOAD_3;
            case "iaload":
                return OPCODE_IALOAD;
            case "laload":
                return OPCODE_LALOAD;
            case "faload":
                return OPCODE_FALOAD;
            case "daload":
                return OPCODE_DALOAD;
            case "aaload":
                return OPCODE_AALOAD;
            case "baload":
                return OPCODE_BALOAD;
            case "caload":
                return OPCODE_CALOAD;
            case "saload":
                return OPCODE_SALOAD;
            case "istore":
                return OPCODE_ISTORE;
            case "lstore":
                return OPCODE_LSTORE;
            case "fstore":
                return OPCODE_FSTORE;
            case "dstore":
                return OPCODE_DSTORE;
            case "astore":
                return OPCODE_ASTORE;
            case "istore_0":
                return OPCODE_ISTORE_0;
            case "istore_1":
                return OPCODE_ISTORE_1;
            case "istore_2":
                return OPCODE_ISTORE_2;
            case "istore_3":
                return OPCODE_ISTORE_3;
            case "lstore_0":
                return OPCODE_LSTORE_0;
            case "lstore_1":
                return OPCODE_LSTORE_1;
            case "lstore_2":
                return OPCODE_LSTORE_2;
            case "lstore_3":
                return OPCODE_LSTORE_3;
            case "fstore_0":
                return OPCODE_FSTORE_0;
            case "fstore_1":
                return OPCODE_FSTORE_1;
            case "fstore_2":
                return OPCODE_FSTORE_2;
            case "fstore_3":
                return OPCODE_FSTORE_3;
            case "dstore_0":
                return OPCODE_DSTORE_0;
            case "dstore_1":
                return OPCODE_DSTORE_1;
            case "dstore_2":
                return OPCODE_DSTORE_2;
            case "dstore_3":
                return OPCODE_DSTORE_3;
            case "astore_0":
                return OPCODE_ASTORE_0;
            case "astore_1":
                return OPCODE_ASTORE_1;
            case "astore_2":
                return OPCODE_ASTORE_2;
            case "astore_3":
                return OPCODE_ASTORE_3;
            case "iastore":
                return OPCODE_IASTORE;
            case "lastore":
                return OPCODE_LASTORE;
            case "fastore":
                return OPCODE_FASTORE;
            case "dastore":
                return OPCODE_DASTORE;
            case "aastore":
                return OPCODE_AASTORE;
            case "bastore":
                return OPCODE_BASTORE;
            case "castore":
                return OPCODE_CASTORE;
            case "sastore":
                return OPCODE_SASTORE;
            case "pop":
                return OPCODE_POP;
            case "pop2":
                return OPCODE_POP2;
            case "dup":
                return OPCODE_DUP;
            case "dup_x1":
                return OPCODE_DUP_X1;
            case "dup_x2":
                return OPCODE_DUP_X2;
            case "dup2":
                return OPCODE_DUP2;
            case "dup2_x1":
                return OPCODE_DUP2_X1;
            case "dup2_x2":
                return OPCODE_DUP2_X2;
            case "swap":
                return OPCODE_SWAP;
            case "iadd":
                return OPCODE_IADD;
            case "ladd":
                return OPCODE_LADD;
            case "fadd":
                return OPCODE_FADD;
            case "dadd":
                return OPCODE_DADD;
            case "isub":
                return OPCODE_ISUB;
            case "lsub":
                return OPCODE_LSUB;
            case "fsub":
                return OPCODE_FSUB;
            case "dsub":
                return OPCODE_DSUB;
            case "imul":
                return OPCODE_IMUL;
            case "lmul":
                return OPCODE_LMUL;
            case "fmul":
                return OPCODE_FMUL;
            case "dmul":
                return OPCODE_DMUL;
            case "idiv":
                return OPCODE_IDIV;
            case "ldiv":
                return OPCODE_LDIV;
            case "fdiv":
                return OPCODE_FDIV;
            case "ddiv":
                return OPCODE_DDIV;
            case "irem":
                return OPCODE_IREM;
            case "lrem":
                return OPCODE_LREM;
            case "frem":
                return OPCODE_FREM;
            case "drem":
                return OPCODE_DREM;
            case "ineg":
                return OPCODE_INEG;
            case "lneg":
                return OPCODE_LNEG;
            case "fneg":
                return OPCODE_FNEG;
            case "dneg":
                return OPCODE_DNEG;
            case "ishl":
                return OPCODE_ISHL;
            case "lshl":
                return OPCODE_LSHL;
            case "ishr":
                return OPCODE_ISHR;
            case "lshr":
                return OPCODE_LSHR;
            case "iushr":
                return OPCODE_IUSHR;
            case "lushr":
                return OPCODE_LUSHR;
            case "iand":
                return OPCODE_IAND;
            case "land":
                return OPCODE_LAND;
            case "ior":
                return OPCODE_IOR;
            case "lor":
                return OPCODE_LOR;
            case "ixor":
                return OPCODE_IXOR;
            case "lxor":
                return OPCODE_LXOR;
            case "iinc":
                return OPCODE_IINC;
            case "i2l":
                return OPCODE_I2L;
            case "i2f":
                return OPCODE_I2F;
            case "i2d":
                return OPCODE_I2D;
            case "l2i":
                return OPCODE_L2I;
            case "l2f":
                return OPCODE_L2F;
            case "l2d":
                return OPCODE_L2D;
            case "f2i":
                return OPCODE_F2I;
            case "f2l":
                return OPCODE_F2L;
            case "f2d":
                return OPCODE_F2D;
            case "d2i":
                return OPCODE_D2I;
            case "d2l":
                return OPCODE_D2L;
            case "d2f":
                return OPCODE_D2F;
            case "i2b":
                return OPCODE_I2B;
            case "i2c":
                return OPCODE_I2C;
            case "i2s":
                return OPCODE_I2S;
            case "lcmp":
                return OPCODE_LCMP;
            case "fcmpl":
                return OPCODE_FCMPL;
            case "fcmpg":
                return OPCODE_FCMPG;
            case "dcmpl":
                return OPCODE_DCMPL;
            case "dcmpg":
                return OPCODE_DCMPG;
            case "ifeq":
                return OPCODE_IFEQ;
            case "ifne":
                return OPCODE_IFNE;
            case "iflt":
                return OPCODE_IFLT;
            case "ifge":
                return OPCODE_IFGE;
            case "ifgt":
                return OPCODE_IFGT;
            case "ifle":
                return OPCODE_IFLE;
            case "if_icmpeq":
                return OPCODE_IF_ICMPEQ;
            case "if_icmpne":
                return OPCODE_IF_ICMPNE;
            case "if_icmplt":
                return OPCODE_IF_ICMPLT;
            case "if_icmpge":
                return OPCODE_IF_ICMPGE;
            case "if_icmpgt":
                return OPCODE_IF_ICMPGT;
            case "if_icmple":
                return OPCODE_IF_ICMPLE;
            case "if_acmpeq":
                return OPCODE_IF_ACMPEQ;
            case "if_acmpne":
                return OPCODE_IF_ACMPNE;
            case "goto":
                return OPCODE_GOTO;
            case "jsr":
                return OPCODE_JSR;
            case "ret":
                return OPCODE_RET;
            case "tableswitch":
                return OPCODE_TABLESWITCH;
            case "lookupswitch":
                return OPCODE_LOOKUPSWITCH;
            case "ireturn":
                return OPCODE_IRETURN;
            case "lreturn":
                return OPCODE_LRETURN;
            case "freturn":
                return OPCODE_FRETURN;
            case "dreturn":
                return OPCODE_DRETURN;
            case "areturn":
                return OPCODE_ARETURN;
            case "return":
                return OPCODE_RETURN;
            case "getstatic":
                return OPCODE_GETSTATIC;
            case "putstatic":
                return OPCODE_PUTSTATIC;
            case "getfield":
                return OPCODE_GETFIELD;
            case "putfield":
                return OPCODE_PUTFIELD;
            case "invokevirtual":
                return OPCODE_INVOKEVIRTUAL;
            case "invokespecial":
                return OPCODE_INVOKESPECIAL;
            case "invokestatic":
                return OPCODE_INVOKESTATIC;
            case "invokeinterface":
                return OPCODE_INVOKEINTERFACE;
            case "invokedynamic":
                return OPCODE_INVOKEDYNAMIC;
            case "new":
                return OPCODE_NEW;
            case "newarray":
                return OPCODE_NEWARRAY;
            case "anewarray":
                return OPCODE_ANEWARRAY;
            case "arraylength":
                return OPCODE_ARRAYLENGTH;
            case "athrow":
                return OPCODE_ATHROW;
            case "checkcast":
                return OPCODE_CHECKCAST;
            case "instanceof":
                return OPCODE_INSTANCEOF;
            case "monitorenter":
                return OPCODE_MONITORENTER;
            case "monitorexit":
                return OPCODE_MONITOREXIT;
            case "wide":
                return OPCODE_WIDE;
            case "multianewarray":
                return OPCODE_MULTIANEWARRAY;
            case "ifnull":
                return OPCODE_IFNULL;
            case "ifnonnull":
                return OPCODE_IFNONNULL;
            case "goto_w":
                return OPCODE_GOTO_W;
            case "jsr_w":
                return OPCODE_JSR_W;
            case "breakpoint":
                return OPCODE_BREAKPOINT;
            case "impdep1":
                return OPCODE_IMPDEP1;
            case "impdep2":
                return OPCODE_IMPDEP2;
            default:
                return -1;
        }
    }
}
