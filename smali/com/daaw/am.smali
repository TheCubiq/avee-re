.class public final synthetic Lcom/daaw/am;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/FilenameFilter;


# static fields
.field public static final synthetic a:Lcom/daaw/am;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/am;

    invoke-direct {v0}, Lcom/daaw/am;-><init>()V

    sput-object v0, Lcom/daaw/am;->a:Lcom/daaw/am;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1, p2}, Lcom/daaw/bm;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
