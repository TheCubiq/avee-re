.class public final Lcom/daaw/sf8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/Iterator;

.field public static final b:Ljava/lang/Iterable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/of8;

    invoke-direct {v0}, Lcom/daaw/of8;-><init>()V

    sput-object v0, Lcom/daaw/sf8;->a:Ljava/util/Iterator;

    new-instance v0, Lcom/daaw/qf8;

    invoke-direct {v0}, Lcom/daaw/qf8;-><init>()V

    sput-object v0, Lcom/daaw/sf8;->b:Ljava/lang/Iterable;

    return-void
.end method

.method public static a()Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lcom/daaw/sf8;->b:Ljava/lang/Iterable;

    return-object v0
.end method

.method public static bridge synthetic b()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Lcom/daaw/sf8;->a:Ljava/util/Iterator;

    return-object v0
.end method
