.class public final enum Lcom/android/grafika/gles/Texture2dProgram$ProgramType;
.super Ljava/lang/Enum;
.source "Texture2dProgram.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/grafika/gles/Texture2dProgram;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ProgramType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/grafika/gles/Texture2dProgram$ProgramType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

.field public static final enum TEXTURE_2D:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

.field public static final enum TEXTURE_EXT:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

.field public static final enum TEXTURE_EXT_BW:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

.field public static final enum TEXTURE_EXT_FILT:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 32
    new-instance v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    const/4 v1, 0x0

    const-string v2, "TEXTURE_2D"

    invoke-direct {v0, v2, v1}, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->TEXTURE_2D:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    new-instance v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    const/4 v2, 0x1

    const-string v3, "TEXTURE_EXT"

    invoke-direct {v0, v3, v2}, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->TEXTURE_EXT:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    new-instance v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    const/4 v3, 0x2

    const-string v4, "TEXTURE_EXT_BW"

    invoke-direct {v0, v4, v3}, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->TEXTURE_EXT_BW:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    new-instance v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    const/4 v4, 0x3

    const-string v5, "TEXTURE_EXT_FILT"

    invoke-direct {v0, v5, v4}, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->TEXTURE_EXT_FILT:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    const/4 v5, 0x4

    new-array v5, v5, [Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    .line 31
    sget-object v6, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->TEXTURE_2D:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    aput-object v6, v5, v1

    sget-object v1, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->TEXTURE_EXT:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    aput-object v1, v5, v2

    sget-object v1, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->TEXTURE_EXT_BW:Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->$VALUES:[Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/android/grafika/gles/Texture2dProgram$ProgramType;
    .locals 1

    .line 31
    const-class v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    return-object p0
.end method

.method public static values()[Lcom/android/grafika/gles/Texture2dProgram$ProgramType;
    .locals 1

    .line 31
    sget-object v0, Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->$VALUES:[Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    invoke-virtual {v0}, [Lcom/android/grafika/gles/Texture2dProgram$ProgramType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/android/grafika/gles/Texture2dProgram$ProgramType;

    return-object v0
.end method
