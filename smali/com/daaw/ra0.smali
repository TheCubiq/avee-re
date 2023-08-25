.class public interface abstract Lcom/daaw/ra0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ra0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lcom/daaw/ra0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ra0$a;

    invoke-direct {v0}, Lcom/daaw/ra0$a;-><init>()V

    sput-object v0, Lcom/daaw/ra0;->a:Lcom/daaw/ra0;

    new-instance v0, Lcom/daaw/zi0$a;

    invoke-direct {v0}, Lcom/daaw/zi0$a;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/zi0$a;->a()Lcom/daaw/zi0;

    move-result-object v0

    sput-object v0, Lcom/daaw/ra0;->b:Lcom/daaw/ra0;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
