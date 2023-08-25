.class public Lcom/daaw/it0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zw;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/zw<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/it0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/it0<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/it0;

    invoke-direct {v0}, Lcom/daaw/it0;-><init>()V

    sput-object v0, Lcom/daaw/it0;->a:Lcom/daaw/it0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/daaw/zw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/daaw/zw<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/it0;->a:Lcom/daaw/it0;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/io/OutputStream;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/io/OutputStream;",
            ")Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
