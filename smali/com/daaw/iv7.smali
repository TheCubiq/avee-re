.class public final Lcom/daaw/iv7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/Iterator;

.field public static final b:Ljava/lang/Iterable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/gv7;

    invoke-direct {v0}, Lcom/daaw/gv7;-><init>()V

    sput-object v0, Lcom/daaw/iv7;->a:Ljava/util/Iterator;

    new-instance v0, Lcom/daaw/hv7;

    invoke-direct {v0}, Lcom/daaw/hv7;-><init>()V

    sput-object v0, Lcom/daaw/iv7;->b:Ljava/lang/Iterable;

    return-void
.end method

.method public static a()Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lcom/daaw/iv7;->b:Ljava/lang/Iterable;

    return-object v0
.end method

.method public static bridge synthetic b()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Lcom/daaw/iv7;->a:Ljava/util/Iterator;

    return-object v0
.end method
