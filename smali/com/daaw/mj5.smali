.class public final Lcom/daaw/mj5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/nj5;


# direct methods
.method public constructor <init>(Lcom/daaw/nj5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mj5;->a:Lcom/daaw/nj5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/daaw/fi6;

    sget-object v0, Lcom/daaw/g93;->E5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/mj5;->a:Lcom/daaw/nj5;

    invoke-static {v0}, Lcom/daaw/nj5;->b(Lcom/daaw/nj5;)Lcom/daaw/zo5;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v1, v1, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget v1, v1, Lcom/daaw/wh6;->e:I

    invoke-virtual {v0, v1}, Lcom/daaw/zo5;->i(I)V

    iget-object v0, p0, Lcom/daaw/mj5;->a:Lcom/daaw/nj5;

    invoke-static {v0}, Lcom/daaw/nj5;->b(Lcom/daaw/nj5;)Lcom/daaw/zo5;

    move-result-object v0

    iget-object p1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object p1, p1, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-wide v1, p1, Lcom/daaw/wh6;->f:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/zo5;->j(J)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->E5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/nj5;->d()Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/mj5;->a:Lcom/daaw/nj5;

    invoke-static {v0}, Lcom/daaw/nj5;->b(Lcom/daaw/nj5;)Lcom/daaw/zo5;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/zo5;->i(I)V

    :cond_0
    return-void
.end method
