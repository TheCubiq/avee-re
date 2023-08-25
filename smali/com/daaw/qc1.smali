.class public final synthetic Lcom/daaw/qc1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/s40;


# static fields
.field public static final synthetic a:Lcom/daaw/qc1;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qc1;

    invoke-direct {v0}, Lcom/daaw/qc1;-><init>()V

    sput-object v0, Lcom/daaw/qc1;->a:Lcom/daaw/qc1;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    check-cast p2, [Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lcom/daaw/rc1;->c(Ljava/io/File;[Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
